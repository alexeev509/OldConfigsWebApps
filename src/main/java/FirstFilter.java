import javax.servlet.*;
import java.io.IOException;

public class FirstFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("i AM FIRST FILTER");
        chain.doFilter(request, response);
    }

    public void destroy() {

    }


}
