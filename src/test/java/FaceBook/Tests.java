package FaceBook;

import org.junit.Test;

import static FaceBook.Actions.*;
import static org.junit.Assert.assertTrue;

/**
 * Created by abarabash on 3/3/16.
 */
public class Tests {

    @Test
    public void test001MakeFriends(){
        Friend alex = new Friend("Alex");
        Friend igor = new Friend("Igor");
        Friend john = new Friend("Jhon");

        makeFriends(alex, igor);

        assertTrue(areFriends(alex, igor));
    }

    @Test
    public void test002directFriends(){
        Friend alex = new Friend("Alex");
        Friend igor = new Friend("Igor");
        Friend john = new Friend("Jhon");

        makeFriends(alex, igor);
        makeFriends(alex, john);

        directFriends(alex);
    }

    @Test
    public void test003inDirectFriends(){
        Friend alex = new Friend("Alex");
        Friend igor = new Friend("Igor");
        Friend john = new Friend("Jhon");

        makeFriends(alex, igor);
        makeFriends(igor, john);

        inDirectFriends(alex);
    }



}
