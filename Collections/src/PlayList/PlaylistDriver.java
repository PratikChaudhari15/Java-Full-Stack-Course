package PlayList;

public class PlaylistDriver {
    public static void main(String[] args) {
        Playlist p1 = new Playlist("Sad Songs",10);

        p1.addSongs("Channa Mereya", "Arijit Singh", "4:50", "Amitabh Bhattacharya", "Ae Dil Hai Mushkil");
        p1.addSongs("Agar Tum Saath Ho", "Alka Yagnik", "5:41", "Irshad Kamil", "Tamasha");
        p1.addSongs("Kal Ho Naa Ho", "Sonu Nigam", "5:21", "Javed Akhtar", "Kal Ho Naa Ho");
        p1.addSongs("Tera Ban Jaunga", "Akhil Sachdeva", "3:56", "Kumaar", "Kabir Singh");
        p1.addSongs("Phir Le Aya Dil", "Rekha Bhardwaj", "6:30", "Sayeed Quadri", "Barfi");
        p1.addSongs("Tum Hi Ho", "Arijit Singh", "4:22", "Mithoon", "Aashiqui 2");
        p1.addSongs("Jeene Bhi De Duniya Hume", "Arijit Singh", "3:40", "Manoj Muntashir", "Dil Sambhal Jaa Zara");
        p1.addSongs("Kabira", "Tochi Raina", "3:43", "Amitabh Bhattacharya", "Yeh Jawaani Hai Deewani");
        p1.addSongs("Dil Diyan Gallan", "Atif Aslam", "4:20", "Irshad Kamil", "Tiger Zinda Hai");
        p1.addSongs("Khairiyat", "Arijit Singh", "4:30", "Amitabh Bhattacharya", "Chhichhore");


        p1.removeSong("Kabira","Yeh Jawaani Hai Deewani");
        p1.showPlaylist();
    }
}

