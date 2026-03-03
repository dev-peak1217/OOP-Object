package study.oop.object.chapter01.Section02;

public class Theater {

    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    /*
    * 자율적인 존재로 만들기
    * if-else 구문의 bag와 ticketSeller의 직접 접근을 막기
    * ticketSeller 내부로 옮긴다.
    * */
    public void enter(Audience audience) {

        ticketSeller.sellTo(audience);

    }
}
