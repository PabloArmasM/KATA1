/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.util.Date;

/**
 *
 * @author Loedded
 */
class Person {

    public final String name;
    public final String surname;
    public final Date birth;
    private static final long MILLISECONDS_PER_YEAR = (long) (1000 * 60 * 60 * 24 * 365.25);

    public Person(String name, String surname, Date birth) {
        this.name = name;
        this.surname = surname;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getBirth() {
        return birth;
    }

    public int getAge() {
        Date today = new Date();
        return (int) milliseconds((today.getTime() - birth.getTime()));
    }

    public String getFullName() {
        return (name + " " + surname);
    }

    private long milliseconds(long millis) {
        return (millis / MILLISECONDS_PER_YEAR);
    }

}
