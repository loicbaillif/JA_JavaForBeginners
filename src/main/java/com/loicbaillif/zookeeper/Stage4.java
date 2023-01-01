package com.loicbaillif.zookeeper;

import com.loicbaillif.tools.Print;

import java.util.Objects;
import java.util.Scanner;

public class Stage4 {
    /* https://hyperskill.org/projects/229/stages/1150/implement
     *
     * ***** DESCRIPTION *****
     * Now it's time to make our project user-friendly. In this final stage,
     * you'll make your software ready for the zoo staff to use. Your program
     * should understand the habitat numbers, show the animals, and be able to
     * work continuously without having to be restarted.
     */
    public static void main() {
        Print.title("Stage 4: Sustainable care");

        // Variables
        String camel = """
            Switching on the camera in the camel habitat...
             ___.-''''-.
            /___  @    |
            ',,,,.     |         _.'''''''._
                 '     |        /           \\
                 |     \\    _.-'             \\
                 |      '.-'                  '-.
                 |                               ',
                 |                                '',
                  ',,-,                           ':;
                       ',,| ;,,                 ,' ;;
                          ! ; !'',,,',',,,,'!  ;   ;:
                         : ;  ! !       ! ! ;  ;   :;
                         ; ;   ! !      ! !  ; ;   ;,
                        ; ;    ! !     ! !   ; ;
                        ; ;    ! !    ! !     ; ;
                       ;,,      !,!   !,!     ;,;
                       /_I      L_I   L_I     /_I
            Look at that! Our little camel is sunbathing!""";

        String lion = """
            Switching on the camera in the lion habitat...
                                                           ,w.
                                                         ,YWMMw  ,M  ,
                                    _.---.._   __..---._.'MMMMMw,wMWmW,
                               _.-""        '''           YP"WMMMMMMMMMb,
                            .-' __.'                   .'     MMMMW^WMMMM;
                _,        .'.-'"; `,       /`     .--""      :MMM[==MWMW^;
             ,mM^"     ,-'.'   /   ;      ;      /   ,       MMMMb_wMW"  @\\
            ,MM:.    .'.-'   .'     ;     `\\    ;     `,     MMMMMMMW `"=./`-,
            WMMm__,-'.'     /      _.\\      F'''-+,,   ;_,_.dMMMMMMMM[,_ / `=_}
            "^MP__.-'    ,-' _.--""   `-,   ;       \\  ; ;MMMMMMMMMMW^``; __|
                       /   .'            ; ;         )  )`{  \\ `"^W^`,   \\  :
                      /  .'             /  (       .'  /     Ww._     `.  `"
                     /  Y,              `,  `-,=,_{   ;      MMMP`""-,  `-._.-,
                    (--, )                `,_ / `) \\/"")      ^"      `-, -;"\\:
            The lion is roaring!""";

        String deer = """
            Switching on the camera in the deer habitat...
               /|       |\\
            `__\\       //__'
               ||      ||
             \\__`\\     |'__/
               `_\\   //_'
               _.,:---;,._
               \\_:     :_/
                 |@. .@|
                 |     |
                 ,\\.-./ \\
                 ;;`-'   `---__________-----.-.
                 ;;;                         \\_\\
                 ';;;                         |
                  ;    |                      ;
                   \\   \\     \\        |      /
                    \\_, \\    /        \\     |\\
                      |';|  |,,,,,,,,/ \\    \\ \\_
                      |  |  |           \\   /   |
                      \\  \\  |           |  / \\  |
                       | || |           | |   | |
                       | || |           | |   | |
                       | || |           | |   | |
                       |_||_|           |_|   |_|
                      /_//_/           /_/   /_/
            Our 'Bambi' looks hungry. Let's go to feed it!""";

        String goose = """
            Switching on the camera in the goose habitat...
            
                                                _
                                            ,-"" "".
                                          ,'  ____  `.
                                        ,'  ,'    `.  `._
               (`.         _..--.._   ,'  ,'        \\    \\
              (`-.\\    .-""        ""'   /          (  d _b
             (`._  `-"" ,._             (            `-(   \\
             <_  `     (  <`<            \\              `-._\\
              <`-       (__< <           :
               (__        (_<_<          ;
                `------------------------------------------
            The goose is staring intently at you... Maybe it's time to change the channel?""";

        String bat = """
            Switching on the camera in the bat habitat...
            _________________               _________________
             ~-.              \\  |\\___/|  /              .-~
                 ~-.           \\ / o o \\ /           .-~
                    >           \\  W  //           <
                   /             /~---~\\             \\
                  /_            |       |            _\\
                     ~-.        |       |        .-~
                        ;        \\     /        i
                       /___      /\\   /\\      ___\\
                            ~-. /  \\_/  \\ .-~
                               V         V
            This bat looks like it's doing fine.""";

        String rabbit = """
            Switching on the camera in the rabbit habitat...
                     ,
                    /|      __
                   / |   ,-~ /
                  Y :|  //  /
                  | jj /( .^
                  >-"~"-v"
                 /       Y
                jo  o    |
               ( ~T~     j
                >._-' _./
               /   "~"  |
              Y     _,  |
             /| ;-"~ _  l
            / l/ ,-"~    \\
            \\//\\/      .- \\
             Y        /    Y
             l       I     !
             ]\\      _\\    /"\\
            (" ~----( ~   Y.  )
            It looks like we will soon have more rabbits!""";

        String emptyHab = "Sorry, we don't have that many animals";
        String[] animals = {camel, lion, deer, goose, bat, rabbit, emptyHab};
        String askVisitor = "Please enter the number of the habitat " +
                "you would like to view:";
        String endVisit = "See you later!";
        String invalidInt = "Please enter the habitat number, or 'exit'.";

        Scanner scanner = new Scanner(System.in);
        String userChoice;
        int parsedUserChoice;
        System.out.println(askVisitor);
        userChoice = scanner.next();

        while (!Objects.equals(userChoice, "exit")) {
            try {
                parsedUserChoice = Integer.parseInt(userChoice);
                System.out.println(animals[parsedUserChoice]);
                System.out.println(askVisitor);
            } catch (NumberFormatException e) {
                System.out.println(invalidInt);
            }

            userChoice = scanner.next();
        }

        System.out.println(endVisit);

        Print.subtitle("End of Stage 4");
    }
}
