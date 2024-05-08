package kurtoswebapplication.models;

public class HomepageModel
{
    String firstName;
    String lastName;
    String company;
    String industry;
    String errorMessage;
    String title;

    public String getFirstName()
    {
        return firstName;
    }

    public String getTitle()
    {
        return title;
    }

    public String getErrorMessage()
    {
        return errorMessage;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getCompany()
    {
        return company;
    }

    public String getIndustry()
    {
        return industry;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setErrorMessage(String errorMessage)
    {
        this.errorMessage = errorMessage;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setCompany(String company)
    {
        this.company = company;
    }

    public void setIndustry(String industry)
    {
        this.industry = industry;
    }

    public HomepageModel(String title, String firstName, String lastName, String company, String industry, String errorMessage)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setCompany(company);
        setIndustry(industry);
        setErrorMessage(errorMessage);
        setTitle(title);
    }

}
