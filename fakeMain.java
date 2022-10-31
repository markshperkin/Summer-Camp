public class fakeMain {
  public static void main(String[] args) {
    System.out.println(DataReader.getAllChild());
    System.out.println(DataReader.getAllCounselors());
    System.out.println(DataReader.getAllDirectors());
    System.out.println(DataReader.getAllParents());

    DataWriter.saveChild("marcus", "campbell", "04/15/2003", "Male", "medium", "1", null, null);
  }
}