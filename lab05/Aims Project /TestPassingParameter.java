
public class TestPassingParameter {
    static class DVDWrapper {
        DigitalVideoDisc disc;

        DVDWrapper(DigitalVideoDisc disc) {
            this.disc = disc;
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
        DVDWrapper jungleDVDWrapper = new DVDWrapper(jungleDVD);
        DVDWrapper cinderellaDVDWrapper = new DVDWrapper(cinderellaDVD);

        // Swap DVDs using a wrapper class
        swap(jungleDVDWrapper, cinderellaDVDWrapper);
        System.out.println("jungle dvd title: " + jungleDVDWrapper.disc.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVDWrapper.disc.getTitle());

        // Change the title of a DVD directly
        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }

    // Method to swap DVDs using a wrapper class
    public static void swap(DVDWrapper dvd1, DVDWrapper dvd2) {
        DigitalVideoDisc tmp = dvd1.disc;
        dvd1.disc = dvd2.disc;
        dvd2.disc = tmp;
    }

    // Method to change the title of a DVD directly
    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
}

