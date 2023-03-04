package com.loicbaillif.zookeeper;

import com.loicbaillif.tools.Print;

public class Stage2 {
    /* https://hyperskill.org/projects/229/stages/1148/implement
     *
     * ***** Show me an animal *****
     *
     */
    public static void main() {
        Print.title("Stage 2 - Show me an animal");

        String zooCamel = """
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
                Look at that! Our little camel is sunbathing!
                """;

        System.out.println(zooCamel);

        Print.subtitle("End of stage 2");
    }
}
