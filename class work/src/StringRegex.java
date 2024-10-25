public class StringRegex {

    public boolean emailValidation(String email){
//        String email = "sundayjnr10@gmail.com";
        String pattern1 = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        return email.matches(pattern1);
    }

    public  boolean phoneNoValidation(String phoneNo){
        String pattern2 = "^[0-9]{11}$";
        return phoneNo.matches(pattern2);
    }
}
