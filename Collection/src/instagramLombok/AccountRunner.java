package instagramLombok;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class AccountRunner {
    public static void main(String[] args) {
        List<AccountInfo> name = new LinkedList<>();
        System.out.println(name.isEmpty());
        AccountInfo acc1 =new AccountInfo("xyz","xyz@gmail.com",9868978436l,
                "8685343","12/1/1989",38,"male");
        AccountInfo acc =new AccountInfo();
        acc.setUserName("sujay");
        acc.setEmailId("sujay@gmail.com");
        acc.setDob("13/02/1997");
        acc.setAge(28);
        acc.setPhoneNumber(9480040215l);
        acc.setGender("male");
        acc.setPsw("5465213");
         name.add(acc1);
         name.add(acc);
        System.out.println(name);

        AccountInfo acc2 =new AccountInfo("sneha","sneha@gmail.com",9868978436l,
                "8685343","25/3/2002",22,"female");
        AccountInfo acc3 =new AccountInfo("rahul","rahul@gmail.com",8868978436l,
                "8685343","16/4/1992",32,"female");

        List<AccountInfo> name1 = new LinkedList<>();
        name1.add(acc2);
        name1.add(acc3);

        //name.addAll((Collection<? extends AccountInfo>) acc2);
        //name.addAll(2, (Collection<? extends AccountInfo>) acc3);
        name.addAll(1,name1);
        System.out.println(name);

        System.out.println(name.get(0));

        System.out.println(name.contains(acc3));

        System.out.println(name.size());

        System.out.println(name.indexOf(acc1));

        System.out.println(name.isEmpty());

        System.out.println(name.iterator());

    }
}
