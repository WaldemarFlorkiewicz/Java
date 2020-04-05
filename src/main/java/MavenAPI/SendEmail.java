package MavenAPI;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendEmail {
    public static void main(String[] args) throws EmailException {
        Email email = new SimpleEmail();
        email.setHostName("poczta.interia.pl");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("user_name", "password"));
        email.setSSLOnConnect(true);
        email.setFrom("TWOJA_NAZWA@interia.pl");
        email.setSubject("Hello");
        email.setMsg("Witam, robię super kurs programowania!");
        email.addTo("ADRES_EMAIL_GDZIE_WYSLAC");
        System.out.println("Rozpoczęto wysyłanie wiadomości email");
        email.send();
        System.out.println("Wiadomość wysłana");
    }
}
