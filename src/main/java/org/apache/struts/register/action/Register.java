package org.apache.struts.register.action;



import org.apache.struts.register.model.Person;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;

public class Register extends ActionSupport {

    private static final long serialVersionUID = 1L;

    private Person personBean = new Person();
    private static ArrayList<Person> liste = new ArrayList<Person>();

    public String execute() throws Exception {
        //call Service class to store personBean's state in database
        getListe().add(personBean);
        return SUCCESS;
    }

    public void validate() {
        try {
            if (personBean.getFirstName().length() == 0) {
                addFieldError("personBean.firstName", "First name is required.");
            }

            if (personBean.getEmail().length() == 0) {
                addFieldError("personBean.email", "Email is required.");
            }

            if (personBean.getAge() < 18) {
                addFieldError("personBean.age", "Age is required and must be 18 or older");
            }
        } catch (Exception e) {
        }
    }

    public String list() throws Exception {
        return SUCCESS;
    }

    public Person getPersonBean() {
        return personBean;
    }

    public void setPersonBean(Person person) {
        personBean = person;
    }

    /**
     * @return the liste
     */
    public ArrayList<Person> getListe() {
        return liste;
    }

    /**
     * @param aListe the liste to set
     */
    public void setListe(ArrayList<Person> aListe) {
        liste = aListe;
    }

}
