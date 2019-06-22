/**
 * @Description: TODO
 * @Auther: zhanglei
 * @Date: 2019-5-7 14:14
 */
package pattern.creational.builder.myBuilder;

public class Human {

    public String getFoot() {
        return foot;
    }

    public void setFoot(String foot) {
        this.foot = foot;
    }

    public String getHand() {
        return hand;
    }

    public void setHand(String hand) {
        this.hand = hand;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    String foot;
    String hand;
    String head;
    String body;

    @Override
    public String toString() {
        return "Human{" +
                "foot='" + foot + '\'' +
                ", hand='" + hand + '\'' +
                ", head='" + head + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
