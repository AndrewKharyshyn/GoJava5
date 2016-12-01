package Module_5;

public class Controller {

    API apis[] = new API[3];

    {
        apis[0] = new GoogleAPI();
        apis[1] = new TripAdvisorAPI();
        apis[2] = new BookingComAPI();
    }

    Room[] requestRooms(int price, int persons, String city, String hotel) {
        Room result[] = new Room[15];
        for (int i = 0, counter = 0; i < apis.length; i++) {
            Room[] roomTemp = apis[i].findRooms(price, persons, city, hotel);
            for (int j = 0; j < roomTemp.length; j++) {
                result[counter++] = roomTemp[j];
                System.out.println(roomTemp[j]);
            }
        }
        return result;
    }

    Room[] check(API api1, API api2) {
        Room[] checkResult = new Room[10];
        Room[] temp1 = api1.findRooms(0, 0, null, null);
        Room[] temp2 = api2.findRooms(0, 0, null, null);
        for (int i = 0, count = 0; i < temp1.length; i++) {
            if (temp1[i] == null) {
                break;
            }
            for (int j = 0; j < temp2.length; j++) {
                if (temp2[j] == null) {
                    break;
                }
                if (temp1[i].equals(temp2[j])) {
                    checkResult[count++] = temp1[i];
                }
            }
        }
        return checkResult;
    }
}
