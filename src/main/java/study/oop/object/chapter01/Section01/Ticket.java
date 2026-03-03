package study.oop.object.chapter01.Section01;

/*
* 영화관 티켓
* */
public class Ticket {

    private Long fee;

    public Ticket(Long fee) {
        this.fee = fee;
    }

    public Long getFee() {
        return fee;
    }
}

