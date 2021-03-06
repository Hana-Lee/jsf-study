package co.kr.leehana.filter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * @author Hana Lee
 * @since 2015-10-26 18:55
 */
public class CharacterEncodingFilter implements Filter {

	private String encoding = "UTF-8";

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		final String encodingParam = filterConfig.getInitParameter("encoding");
		if (encodingParam != null && !encodingParam.isEmpty()) {
			encoding = encodingParam;
		}
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
			ServletException {
		// Conditionally select and set the character encoding to be used
		String requestEncoding = request.getCharacterEncoding();
		if (requestEncoding == null || requestEncoding.isEmpty()) {
			request.setCharacterEncoding(encoding);
		}
		String responseEncoding = response.getCharacterEncoding();
		if (responseEncoding == null || responseEncoding.isEmpty()) {
			response.setCharacterEncoding(encoding);
		}

		// Pass control on to the next filter
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		this.encoding = null;
	}
}
