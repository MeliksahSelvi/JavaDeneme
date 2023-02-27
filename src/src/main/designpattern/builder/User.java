package src.main.designpattern.builder;

public class User {
    private String name;
    private String surName;
    private String email;
    private String telefonNo;

    private User(UserBuilder userBuilder) {
        this.name = userBuilder.name;
        this.surName = userBuilder.surName;
        this.email = userBuilder.email;
        this.telefonNo = userBuilder.telefonNo;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public static class UserBuilder{

        private String name;
        private String surName;
        private String email;
        private String telefonNo;

        public UserBuilder(String name, String surName) {
            this.name = name;
            this.surName = surName;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder telefonNo(String telefonNo) {
            this.telefonNo = telefonNo;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}