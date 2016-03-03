package FaceBook;

/**
 * Created by abarabash on 3/3/16.
 */
public class Actions {

    public static void makeFriends(Friend friend1, Friend friend2){
        friend1.friends.add(friend2);
        friend2.friends.add(friend1);
    }

    public static Boolean areFriends(Friend friend1, Friend friend2){
        Boolean result1 = false;
        Boolean result2 = false;

        for(Friend each : friend1.friends){
            result1 = each == friend2;
        }

        for (Friend each : friend2.friends){
            result2 = each == friend1;
        }

        return result1&&result2;
    }

    public static void directFriends(Friend friend){
        System.out.println("Friends:");
        for(Friend each:friend.friends){
            System.out.println(each.name);
        }
    }

    public static void breathFirstSearch(Friend root){
        //if(root.name.equals(name))
            //System.out.println("find in root");

        Queue queue = new Queue();
        root.visited = true;
        queue.enqueue(root);

        while(queue.first != null){
            Friend c = (Friend) queue.dequeue();
            for(Friend each: c.friends){

                if(!each.visited){
                    System.out.println(each.name + " ");
                    each.visited = true;
                    //if(n.name.equals(name))
                       // System.out.println("Find " + n);
                    queue.enqueue(each);
                }
            }
        }
    }

    public static void inDirectFriends(Friend friend){
        breathFirstSearch(friend);
    }
}
