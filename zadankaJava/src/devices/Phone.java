package devices;

import com.company.Human;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Phone extends Device {
    public Double screenSize;
    static final String SERVER_URL = "127.0.0.1";
    static final int PORT = 8080;
    static final String VERSION = "1.0.0";
    private List<Application> applications = new ArrayList<Application>();

    public Phone(String producer, String model, Integer yearOfProduction, Double value, Double screenSize) {
        super(producer, model, yearOfProduction, value);
        this.screenSize = screenSize;
    }

    public boolean isApplicationAlreadyInstalled(Application application) {
        for (int i = 0; i < this.applications.size() - 1; i++) {
            if (this.applications.get(i) == application) {
                return true;
            }
        }
        return false;
    }

    public boolean isApplicationWithGivenNameAlreadyInstalled(String applicationName) {
        for (int i = 0; i < this.applications.size() - 1; i++) {
            if (this.applications.get(i).getName() == applicationName) {
                return true;
            }
        }
        return false;
    }

    public void printAllFreeApplications() {
        System.out.println("All free applications: ");
        for (int i = 0; i < this.applications.size() - 1; i++) {
            if (this.applications.get(i).getPrice() == 0.0) {
                System.out.println(this.applications.get(i).toString());
            }
        }
    }

    public ArrayList<Application> allInstalledApplications() {
        List<Application> allInstalledApps = new ArrayList<Application>();
        for (int i = 0; i < this.applications.size() - 1; i++) {
            allInstalledApps.add(this.applications.get(i));
        }
        return (ArrayList<Application>) allInstalledApps;
    }

    public void printAllInstalledApplicationNamesInAlphabeticalOrder() {
        this.applications.sort(Comparator.comparing(Application::getName));
        System.out.println("All installed application names in alphabetical order: ");
        for (int i = 0; i < this.applications.size() - 1; i++) {
            System.out.println(this.applications.get(i).getName());
        }
    }

    public void printAllInstalledApplicationNamesInPriceOrder() {
        this.applications.sort(Comparator.comparing(Application::getPrice));
        System.out.println("All installed application names in price order: ");
        for (int i = 0; i < this.applications.size() - 1; i++) {
            System.out.println(this.applications.get(i).getName());
        }
    }

    public void addApplication(Application application) throws Exception {
        if (!this.isApplicationAlreadyInstalled(application)) {
            applications.add(application);
        } else {
            throw new Exception("Already you installed the application.");
        }
    }

    public void installApplication(Human buyer, Application application) throws Exception {
        if(buyer.cash < application.getPrice()) {
            throw new Exception("You do not have enough money to buy this application.");
        }
        addApplication(application);
        buyer.cash -= application.getPrice();
    }

    @Override
    public void turnOn() {
        System.out.println("OK");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (buyer.cash < price) {
            throw new Exception("You do not have enough money to buy this car.");
        }
        if (seller.phone != this) {
            throw new Exception("You cannot sell phone which is not yours.");
        }
        buyer.cash -= price;
        seller.cash += price;
        buyer.phone = this;
        seller.phone = null;
        System.out.println(buyer.firstName + " already bought " + this + " from " + seller.firstName);
    }

    public void installAnnApp(String name)
    {

    }
    public void installAnnApp(String name, String version)
    {

    }
    public void installAnnApp(String name, String version, String url)
    {

    }
    public void installAnnApp(String[] names)
    {

    }
    public void installAnnApp(URL url)
    {

    }

    public String toString() {
        return this.producer + " " + this.model + " " + this.screenSize;
    }
}

