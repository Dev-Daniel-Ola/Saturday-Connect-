package controller;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.FileChooser;
import javafx.stage.Window;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.TextField;
import javafx.fxml.FXMLLoader;
import java.io.IOException;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class AttendeeController{            

    @FXML
    private RadioButton maleRadio;
    @FXML
    private RadioButton femaleRadio;
    @FXML
    private ToggleGroup genderGroup;
    @FXML
    private Button pictureButton;
    @FXML
    private Button signUpButton;
    @FXML
    private ImageView imageView;
    @FXML
    private TextField fullNameField;
    @FXML
    private TextField numberField;
    @FXML
    private TextField emailField;
    @FXML
    private TextField passwordField;
    @FXML
    private TextField confirmPasswordField;
    @FXML
    private ComboBox<String>countryCodeComboBox;
    @FXML
    private ComboBox<String>countryComboBox;
    @FXML
    private ComboBox<String>stateComboBox;
    @FXML
    private ComboBox<String>lgaComboBox;
    
    private final Map<String, String>codeToCountryMap = new HashMap<>();
    private final Map<String, ObservableList<String>>countryStateMap = new HashMap<>();
    private final Map<String, ObservableList<String>>stateLgaMap = new HashMap<>();

    @FXML
    public void initialize(){

        //Details of Country Code and the Country
        codeToCountryMap.put("+213", "Algeria");
        codeToCountryMap.put("+20", "Egypt");
        codeToCountryMap.put("+251", "Ethiopia");
        codeToCountryMap.put("+233", "Ghana");
        codeToCountryMap.put("+254", "Kenya");
        codeToCountryMap.put("+212", "Morocco");
        codeToCountryMap.put("+234", "Nigeria");
        codeToCountryMap.put("+250", "Rwanda");
        codeToCountryMap.put("+27", "South Africa");
        codeToCountryMap.put("+255", "Tanzania");
        codeToCountryMap.put("+256", "Uganda");

        countryCodeComboBox.setItems(FXCollections.observableArrayList(codeToCountryMap.keySet()));

        //Showcasing Country and its States
        countryStateMap.put("Nigeria", FXCollections.observableArrayList(
            "Abia", "Adamawa", "Akwa Ibom", "Anambra", "Bauchi", "Bayelsa",
            "Benue", "Borno", "Cross River", "Delta", "Ebonyi", "Edo",
            "Ekiti", "Enugu", "FCT", "Gombe", "Imo", "Jigawa", "Kaduna",
            "Kano", "Katsina", "Kebbi", "Kogi", "Kwara", "Lagos",
            "Nasarawa", "Niger", "Ogun", "Ondo", "Osun", "Oyo",
            "Plateau", "Rivers", "Sokoto", "Taraba", "Yobe", "Zamfara"));

        countryStateMap.put("South Africa", FXCollections.observableArrayList(
            "Eastern Cape", "Free State", "Gauteng", "KwaZulu-Natal",
            "Limpopo", "Mpumalanga", "Northern Cape", "North West", "Western Cape"));

        countryStateMap.put("Kenya", FXCollections.observableArrayList(
            "Nairobi", "Mombasa", "Kisumu", "Nakuru", "Kiambu", "Machakos", 
            "Uasin Gishu", "Kericho", "Bungoma", "Meru", "Kakamega", "Garissa"));

        countryStateMap.put("Egypt", FXCollections.observableArrayList(
            "Cairo", "Alexandria", "Giza", "Luxor", "Aswan", "Suez",
            "Port Said", "Ismailia", "Damietta", "Qena", "Asyut"));

        countryStateMap.put("Ghana", FXCollections.observableArrayList(
            "Ashanti", "Brong-Ahafo", "Central", "Eastern", "Greater Accra",
            "Northern", "Upper East", "Upper West", "Volta", "Western"));

        countryStateMap.put("Ethiopia", FXCollections.observableArrayList(
            "Addis Ababa", "Afar", "Amhara", "Benishangul-Gumuz", "Dire Dawa",
            "Gambela", "Harari", "Oromia", "Sidama", "Somali", "South West Ethiopia",
            "Southern Nations, Nationalities, and Peoples", "Tigray"));

        countryStateMap.put("Morocco", FXCollections.observableArrayList(
            "Casablanca-Settat", "Fès-Meknès", "Marrakech-Safi", "Rabat-Salé-Kénitra",
            "Tanger-Tétouan-Al Hoceïma", "Béni Mellal-Khénifra", "Souss-Massa",
            "Oriental", "Drâa-Tafilalet", "Guelmim-Oued Noun"));

        countryStateMap.put("Uganda", FXCollections.observableArrayList(
            "Central", "Eastern", "Northern", "Western"));

        countryStateMap.put("Tanzania", FXCollections.observableArrayList(
            "Arusha", "Dar es Salaam", "Dodoma", "Geita", "Iringa", "Kagera",
            "Kigoma", "Kilimanjaro", "Lindi", "Mara", "Mbeya", "Morogoro",
            "Mtwara", "Mwanza", "Pwani", "Rukwa", "Ruvuma", "Shinyanga",
            "Singida", "Tabora", "Tanga", "Zanzibar North", "Zanzibar South"));

        countryStateMap.put("Algeria", FXCollections.observableArrayList(
            "Adrar", "Chlef", "Laghouat", "Oum El Bouaghi", "Batna", "Béjaïa",
            "Biskra", "Béchar", "Blida", "Bouira", "Tamanrasset", "Tébessa",
            "Tlemcen", "Tiaret", "Tizi Ouzou", "Algiers", "Djelfa", "Jijel",
            "Sétif", "Saïda", "Skikda", "Sidi Bel Abbès", "Annaba", "Guelma",
            "Constantine", "Médéa", "Mostaganem", "M'Sila", "Mascara", "Ouargla",
            "Oran", "El Bayadh", "Illizi", "Bordj Bou Arréridj", "Boumerdès",
            "El Tarf", "Tindouf", "Tissemsilt", "El Oued", "Khenchela",
            "Souk Ahras", "Tipaza", "Mila", "Aïn Defla", "Naâma", "Aïn Témouchent",
            "Ghardaïa", "Relizane"));

        countryStateMap.put("Rwanda", FXCollections.observableArrayList(
            "Kigali",
            "Eastern Province",
            "Northern Province",
            "Southern Province",
            "Western Province"));

        // Nigeria States to LGAs (mostly complete)
        stateLgaMap.put("Lagos", FXCollections.observableArrayList(
            "Agege", "Ajeromi-Ifelodun", "Alimosho", "Amuwo-Odofin", "Apapa",
            "Badagry", "Epe", "Eti-Osa", "Ibeju-Lekki", "Ifako-Ijaiye",
            "Ikeja", "Ikorodu", "Kosofe", "Lagos Island", "Lagos Mainland",
            "Mushin", "Ojo", "Oshodi-Isolo", "Shomolu", "Surulere"));

        stateLgaMap.put("Oyo", FXCollections.observableArrayList(
            "Afijio", "Akinyele", "Atiba", "Atisbo", "Egbeda", "Ibadan North",
            "Ibadan North-East", "Ibadan North-West", "Ibadan South-East",
            "Ibadan South-West", "Ibarapa Central", "Ibarapa East", "Ibarapa North",
            "Ido", "Irepo", "Iseyin", "Itesiwaju", "Iwajowa", "Kajola", "Lagelu",
            "Ogbomosho North", "Ogbomosho South", "Ogo Oluwa", "Olorunsogo",
            "Oluyole", "Saki East", "Saki West", "Surulere"));

        stateLgaMap.put("Akwa Ibom", FXCollections.observableArrayList(
            "Abak", "Eastern Obolo", "Eket", "Esit Eket", "Essien Udim", "Etim Ekpo",
            "Etinan", "Ibeno", "Ibesikpo Asutan", "Ibiono-Ibom", "Ika", "Ikono",
            "Ikot Abasi", "Ikot Ekpene", "Ini", "Itu", "Mbo", "Mkpat-Enin", "Nsit Atai",
            "Nsit Ibom", "Nsit Ubium", "Obot Akara", "Okobo", "Onna", "Oron",
            "Oruk Anam", "Udung-Uko", "Ukanafun", "Uruan", "Urue-Offong/Oruko", "Uyo"));

        stateLgaMap.put("Ekiti", FXCollections.observableArrayList(
            "Ado Ekiti", "Efon", "Ekiti East", "Ekiti South-West", "Ekiti West",
            "Emure", "Gbonyin", "Ido Osi", "Ijero", "Ikere", "Ikole", "Ilejemeje",
            "Irepodun/Ifelodun", "Ise/Orun", "Moba", "Oye"));

        stateLgaMap.put("Federal Capital Territory (FCT)", FXCollections.observableArrayList(
            "Abaji", "Bwari", "Gwagwalada", "Kuje", "Kwali", "Municipal Area Council"));

        stateLgaMap.put("Kano", FXCollections.observableArrayList(
            "Ajingi", "Albasu", "Bagwai", "Bebeji", "Bichi", "Bunkure",
            "Dala", "Dambatta", "Dawakin Kudu", "Dawakin Tofa", "Doguwa",
            "Fagge", "Gabasawa", "Garko", "Garun Mallam", "Gaya", "Gezawa",
            "Gwale", "Gwarzo", "Kabo", "Kano Municipal", "Karaye", "Kibiya",
            "Kiru", "Kumbotso", "Kunchi", "Kura", "Madobi", "Makoda",
            "Minjibir", "Nasarawa", "Rano", "Rimin Gado", "Rogo",
            "Shanono", "Sumaila", "Takai", "Tarauni", "Tofa", "Tsanyawa",
            "Tudun Wada", "Ungogo", "Warawa", "Wudil"));

        stateLgaMap.put("Enugu", FXCollections.observableArrayList(
            "Aninri", "Awgu", "Enugu East", "Enugu North", "Enugu South",
            "Ezeagu", "Igbo Etiti", "Igbo Eze North", "Igbo Eze South",
            "Isi Uzo", "Nkanu East", "Nkanu West", "Nsukka", "Udenu",
            "Oji River", "Uzo-Uwani"));

        stateLgaMap.put("Ogun", FXCollections.observableArrayList(
            "Abeokuta North", "Abeokuta South", "Ado-Odo/Ota", "Ewekoro",
            "Ifo", "Ijebu East", "Ijebu North", "Ijebu North East", "Ijebu Ode",
            "Ikenne", "Imeko Afon", "Ipokia", "Obafemi Owode", "Odeda",
            "Odogbolu", "Ogun Waterside", "Remo North", "Shagamu"));

        stateLgaMap.put("Edo", FXCollections.observableArrayList(
            "Esan Central", "Esan North-East", "Esan South-East", "Esan West",
            "Egor", "Ikpoba Okha", "Oredo", "Orhionmwon", "Ovia North-East",
            "Ovia South-West", "Uhunmwonde"));


        // ------- Other African countries with major subdivisions -----------

        // South Africa (Provinces -> Major Municipalities)
        stateLgaMap.put("Gauteng", FXCollections.observableArrayList(
            "City of Johannesburg", "City of Tshwane", "Ekurhuleni"));

        stateLgaMap.put("KwaZulu-Natal", FXCollections.observableArrayList(
            "eThekwini", "uMgungundlovu", "King Cetshwayo"));

        stateLgaMap.put("Western Cape", FXCollections.observableArrayList(
            "City of Cape Town", "West Coast District"));

        // Kenya (Counties)
        stateLgaMap.put("Nairobi", FXCollections.observableArrayList(
            "Westlands", "Kasarani", "Kibra", "Lang'ata", "Embakasi"));

        stateLgaMap.put("Mombasa", FXCollections.observableArrayList(
            "Mvita", "Nyali", "Kisauni", "Likoni", "Jomvu"));

        // Egypt (Governorates)
        stateLgaMap.put("Cairo", FXCollections.observableArrayList(
            "Heliopolis", "Nasr City", "Maadi"));

        stateLgaMap.put("Alexandria", FXCollections.observableArrayList(
            "Montaza", "Sidi Gaber", "Ras El Tin"));

        // Ghana (Regions -> Districts)
        stateLgaMap.put("Greater Accra", FXCollections.observableArrayList(
            "Accra Metropolitan", "Tema Metropolitan", "Ga East Municipal"));

        stateLgaMap.put("Ashanti", FXCollections.observableArrayList(
            "Kumasi Metropolitan", "Atwima Nwabiagya", "Ejisu-Juaben"));

        // Ethiopia (Regions -> Woredas)
        stateLgaMap.put("Oromia", FXCollections.observableArrayList(
            "Adama", "Bishoftu", "Shashemene"));

        stateLgaMap.put("Amhara", FXCollections.observableArrayList(
            "Bahir Dar", "Gondar", "Debre Markos"));

        // Morocco (Regions -> Prefectures)
        stateLgaMap.put("Casablanca-Settat", FXCollections.observableArrayList(
            "Casablanca", "Mohammedia", "El Jadida"));

        stateLgaMap.put("Rabat-Salé-Kénitra", FXCollections.observableArrayList(
            "Rabat", "Salé", "Kénitra"));            

        // Uganda (Regions -> Districts)
        stateLgaMap.put("Central", FXCollections.observableArrayList(
            "Kampala", "Wakiso", "Mukono"));

        stateLgaMap.put("Western", FXCollections.observableArrayList(
            "Mbarara", "Kasese", "Hoima"));

        // Tanzania (Regions -> Districts)
        stateLgaMap.put("Dar es Salaam", FXCollections.observableArrayList(
            "Ilala", "Kinondoni", "Temeke"));

        stateLgaMap.put("Mwanza", FXCollections.observableArrayList(
            "Ilemela", "Nyamagana", "Sengerema"));            

        // Algeria (Provinces -> Districts)
        stateLgaMap.put("Algiers", FXCollections.observableArrayList(
            "Bab El Oued", "Bir Mourad Raïs", "El Harrach"));

        stateLgaMap.put("Oran", FXCollections.observableArrayList(
            "El Hamri", "Bir El Djir", "Es Senia"));

        // Rwanda (Provinces -> Districts)
        stateLgaMap.put("Kigali", FXCollections.observableArrayList(
            "Gasabo", "Kicukiro", "Nyarugenge"));

        stateLgaMap.put("Eastern Province", FXCollections.observableArrayList(
            "Bugesera", "Gatsibo", "Kayonza", "Ngoma", "Kirehe", "Nyagatare", "Rwamagana"));

        stateLgaMap.put("Northern Province", FXCollections.observableArrayList(
            "Burera", "Gakenke", "Gicumbi", "Musanze", "Rulindo"));

        stateLgaMap.put("Southern Province", FXCollections.observableArrayList(
            "Gisagara", "Huye", "Kamonyi", "Muhanga", "Nyamagabe", "Nyanza", "Nyaruguru", "Ruhango"));

        stateLgaMap.put("Western Province", FXCollections.observableArrayList(
            "Karongi", "Ngororero", "Nyabihu", "Nyamasheke", "Rubavu", "Rusizi", "Rutsiro"));

    }
    @FXML
    private void handleCountryCode(){
        String selectedCode = countryCodeComboBox.getValue();
        String country = codeToCountryMap.get(selectedCode);
        
        if(country != null){

            countryComboBox.setValue(country);

            ObservableList<String>states = countryStateMap.getOrDefault(country, FXCollections.observableArrayList());
            stateComboBox.setItems(states);
            stateComboBox.getSelectionModel().clearSelection();
            lgaComboBox.getItems().clear();
        }
        else{
            countryComboBox.setValue(null);
            stateComboBox.getItems().clear();
            lgaComboBox.getItems().clear();
        }
    }
    public void handleStateSelected(){
        String selectedState = stateComboBox.getValue();
        if(selectedState != null){
            ObservableList<String>lgas = stateLgaMap.getOrDefault(selectedState, FXCollections.observableArrayList());
            lgaComboBox.setItems(lgas);
        }
        else{
            lgaComboBox.getSelectionModel().clearSelection();
        }
    }
    public void handlePictureButton(ActionEvent e){
        FileChooser fileChooser = new FileChooser();

        fileChooser.setTitle("Select a Picture");
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", ".jpeg", ".gif"));

        Window window = ((Node) e.getSource()).getScene().getWindow();    
        File selectedFile = fileChooser.showOpenDialog(window);

        if(selectedFile != null){
            Image image = new Image(selectedFile.toURI().toString());
            imageView.setImage(image);
        }        
    }
    public void handleSignUp(ActionEvent e) throws Exception{
        String fullName = fullNameField.getText();
        String mobileNumber = numberField.getText();
        String email = emailField.getText();
        String password = passwordField.getText();
        String confirmPassword = confirmPasswordField.getText();
        String comboCountry = countryComboBox.getValue();
        String comboState = stateComboBox.getValue();
        String comboLga = lgaComboBox.getValue();

        if((fullName.isEmpty()) || (mobileNumber.isEmpty()) || (email.isEmpty()) || (password.isEmpty()) || (confirmPassword.isEmpty()) || (comboCountry == null) || (comboState == null) || (comboLga == null)){
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Invalid Input");
            alert.setContentText("Please, provide necessary information");
            alert.showAndWait();
            return; 
        }
        Long number;
        try{
            number = Long.parseLong(mobileNumber);
        } catch (NumberFormatException ex){
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Invalid Number");
            alert.setContentText("Phone Number Not Recognised!");
            alert.showAndWait();
            return; 
        }
        if(!password.equals(confirmPassword)){
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Password Mismatch");
            alert.setContentText("Please, Password and Confirm Password do not match");
            alert.showAndWait();
            return; 
        }
        AttendeeExtension.handleSubmit(fullName, number, email, password, confirmPassword, comboCountry, comboState, comboLga);
    }
}
