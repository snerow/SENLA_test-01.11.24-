public class Main {
    public static void main(String[] args) {
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        String myPassword = passwordGenerator.getPassword();
        System.out.println("Созданный пароль из " + passwordGenerator.getNumOfCharactersInPassword() +
                " символов:\t" + myPassword);
    }
}