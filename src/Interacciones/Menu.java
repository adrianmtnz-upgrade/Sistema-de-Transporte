package Interacciones;

public class Menu implements MenuStep1 {
    public static String title;
    
    public Menu(String title){
        Menu.title = title;
    }
    public static void entryMenu(){
        String title = 
            PURPLE + BOLD +
            "\n________________________________________________________________________________________________________                    \n"   +
            "<|                                                                                                        |>                   \n" +
            "<|      ███████╗██╗███████╗████████╗███████╗███╗   ███╗ █████╗     ██████╗ ███████╗" +CYAN+"    ***************   "+PURPLE+" |>         \n" +  
            "<|      ██╔════╝██║██╔════╝╚══██╔══╝██╔════╝████╗ ████║██╔══██╗    ██╔══██╗██╔════╝" +CYAN+"      ********** ***  "+PURPLE+" |>         \n" +                               
            "<|      ███████╗██║███████╗   ██║   █████╗  ██╔████╔██║███████║    ██║  ██║█████╗  " +CYAN+"    ******** ***   ** "+PURPLE+" |>         \n" +  
            "<|      ╚════██║██║╚════██║   ██║   ██╔══╝  ██║╚██╔╝██║██╔══██║    ██║  ██║██╔══╝  " +CYAN+"       *****  ******  "+PURPLE+" |>         \n" +  
            "<|      ███████║██║███████║   ██║   ███████╗██║ ╚═╝ ██║██║  ██║    ██████╔╝███████╗" +CYAN+"      *******   ***   "+PURPLE+" |>         \n" +  
            "<|     ╚══════╝╚═╝╚══════╝   ╚═╝   ╚══════╝╚═╝     ╚═╝╚═╝  ╚═╝    ╚═════╝ ╚══════╝                        |>                    \n" +  
                                                                                
            "<|     ████████╗██████╗  █████╗ ███╗   ██╗███████╗██████╗  ██████╗ ██████╗ ████████╗███████╗███████╗      |>                   \n" +
            "<|     ╚══██╔══╝██╔══██╗██╔══██╗████╗  ██║██╔════╝██╔══██╗██╔═══██╗██╔══██╗╚══██╔══╝██╔════╝██╔════╝      |>                   \n" +
            "<|        ██║   ██████╔╝███████║██╔██╗ ██║███████╗██████╔╝██║   ██║██████╔╝   ██║   █████╗  ███████╗      |>                   \n" +
            "<|        ██║   ██╔══██╗██╔══██║██║╚██╗██║╚════██║██╔═══╝ ██║   ██║██╔══██╗   ██║   ██╔══╝  ╚════██║      |>                   \n" +
            "<|        ██║   ██║  ██║██║  ██║██║ ╚████║███████║██║     ╚██████╔╝██║  ██║   ██║   ███████╗███████║      |>                   \n" +
            "<|        ╚═╝   ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝╚══════╝╚═╝      ╚═════╝ ╚═╝  ╚═╝   ╚═╝   ╚══════╝╚══════╝      |>                   \n" +
            "<|________________________________________________________________________________________________________|>                   \n\n\n"+" "
            + RESET;
        
        String[] lines = title.split("\n");
        for (String line : lines) {
            System.out.printf("%" + ((200 + line.length()) / 2) + "s%n", line);
        }
        
    }
}