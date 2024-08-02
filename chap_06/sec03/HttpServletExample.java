package chap_06.sec03;

public class HttpServletExample {
    public static void main(String[] args) {
//        method(new LoginServlet()); // 로그인 합니다
//        method(new FileDownloadServlet()); // 파일 다운로드 합니다.

        LoginServlet loginServlet = new LoginServlet();
        method(loginServlet);

        FileDownloadServlet fileDownloadServlet = new FileDownloadServlet();
        method(fileDownloadServlet);
    }

    public static void method(HttpServlet servlet) {
        servlet.service();
    }
}


