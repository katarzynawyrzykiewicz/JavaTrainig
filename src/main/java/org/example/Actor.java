package org.example;

public class Actor {
    //    napisać psvm + Tabulator mam główna metodę
//    ctrl +/ i komentarz
// składniki klasy .klasy zawsze publicznie
//1 Pola imie nazwisko ranking oscar wszystkie pola w java zawsze prywatne
    private String firstName;

    private String lastName; //to typ obiektowy z duzej litery
    private int rating; // 1-100 //typ prywmitywny
    private boolean isOskarPrized;
    private int numerButa;

    //2 Konstruktory - Konstruktor tworzy obiekty
    public Actor(String firstNameName, String LastName, int rating, boolean isOskarPrized) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rating = rating;
        this.isOskarPrized = isOskarPrized;

    }

    public Actor(String lastName, String LastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public Actor(String lastName) {
        this.firstName = firstName;

    }

    public Actor() {

    }

    //3 metody- czyności boiled play cod - kod który czesto sie klepie getery i setery ALT+insert dodaj getery i setery
public int calulateSalary(int cout, int bonus)
{
    return cout*bonus;
}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isOskarPrized() {
        return isOskarPrized;
    }

    public void setOskarPrized(boolean isOskarPrized) {
        isOskarPrized = isOskarPrized;
    }



    @Override
    public String toString() {
        return "Actor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rating=" + rating +
                ", isOscarPrized=" + isOskarPrized +
                '}';
    }
}



