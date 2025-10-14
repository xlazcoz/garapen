import java.util.Scanner;

public class MetodologiaArinak {
    static String adios(){
        return "kaixo ze laburpen ikusi nahi duzu";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean bukatu = false;
        /** false den bitartean menua ikusiko da */
        int opcion;
        
        
        while (!bukatu) {
            // menua
            System.out.println("\n === METODOLOGIA AGILEAK ===");
            System.out.println("1. 2.4.1 - Metodologia Agileak");
            System.out.println("2. 2.4.2 - Scrum");
            System.out.println("3. 2.4.3 - Kanban");
            System.out.println("4. Irten");
            System.out.print("Aukeratu (1-4): ");
            
            opcion = scanner.nextInt();
            /**opcion bariablea aukeratutako zenbakia gordetzen du*/
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                /**  1 sakatuz gero metodologia agileak laburpena*/
                    System.out.println("\n --- METODOLOGIA AGILEAK ---");
                    System.out.println("\n WATERFALL");
                    System.out.println("- Analisia -> Diseinua -> Garapena -> Probak -> Implementazioa -> Mantentzea");
                    System.out.println("- Proiektua asi baino leehen galdera batzuk erantzun behar dira taldean ez egiteko gauzak adostu gabe eta bakoitza nahi duen moduan");
                    System.out.println("- Dokumentazio eduki behar da");
                    
                    System.out.println("\n AGILE:");
                    System.out.println("- Sprint-etan banatutako da garapena");
                    System.out.println("- SPRINT 0, SPRINT 1, SPRINT 2...");
                    System.out.println("- Lana azkarrago egiten da fasetan banatuz gero");
                    System.out.println("- Feedback azkarrago ematen dizute aldatu ahal izateko");
                    break;
                    
                case 2:
                /**  2 sakatuz gero scrum laburpena*/
                    System.out.println("\n --- SCRUM ---");
                    System.out.println("- Taldeei arazo baten aurrean elkarlanean aritzen laguntzen du");
                    System.out.println("- Sprint-ak: 2 aste eta hilabete 1 artean");
                    System.out.println("- Sprint bakoitzaren amaieran bezeroak erabakitzen du");
                    
                    System.out.println("\n Gertaerak:");
                    System.out.println("- Sprint Planning: Zer egingo den");
                    System.out.println("- Daily Scrum: 15 minutu egunero");
                    System.out.println("- Retrospectiva: Hobetzeko");
                    
                    System.out.println("\n Rolak:");
                    System.out.println("- Product Owner: Bezeroa ordezkatzen du");
                    System.out.println("- Scrum Master: Taldearen entrenatzailea");
                    System.out.println("- Garapen Taldea: Lana egiten dutenak");
                    break;
                    
                case 3:
                /** 3 sakatuz gero kanban laburpena */
                    System.out.println("\n --- KANBAN ---");
                    System.out.println("- (Seinale bisuala esan nahi du");
                    System.out.println("- Lana ikusteko eta kudeatzeko metodoa");
                    System.out.println("- Prozesua eta lana ikusarazten ditu");
                    
                    System.out.println("\n Taula:");
                    System.out.println("- BACKLOG -> TO DO -> ONGOING -> DONE");
                    System.out.println("- WIP mugak: aldi berean zeregin batzuk bakarrik");
                    System.out.println("- Botila-lepoak identifikatu eta konpondu");
                    break;
                    
                case 4:
                /** 4 sakatuz gero programa bukatzen da*/
                    bukatu = true;
                    System.out.println("Agur");
                    break;
                    
                default:
                /**  beste gauz bat jartzen baduzu 1-4 arteko zenbaki bat aukeratzeko esango dizu*/
                    System.out.println("1-4 artean aukeratu");
            }
            
            if (opcion >= 1 && opcion <= 3) {
            /**  1, 2 edo 3 zenbakiak aukeratuz gero esango dizu enter sakatzeko menura bueltatzeko*/
                System.out.print("\n Sakatu Enter...");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}