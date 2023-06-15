# java-interview
1. OOP:
2. static: thuộc về class not instance, do đó mọi thể hiện đều truy cập vào 1 biến
  final: không thể thay đổi giá trị, final + static = const
  private: trong class
  default: trong 1 package
  protected: các lớp con có thể acess, dù không cùng trường
  public: all class in app
  Ke thua: goi cac thuoc tinh private tu lop con, dung get()
  nest class: 
    + tĩnh: Outer.Nested instance = new Outer.Nested();
    + không tĩnh: Outer outer = new Outer();
                  Outer.Inner inner = outer.new Inner();
   Abstract class: ko thể create instance, chỉ dùng làm base cho lớp con
    + abstract class có thể có các pt abstract ( but có cả pt ko trừu tượng cx đc), ko có phần thân, chỉ có phần khai báo
    + lớp con kế thừa phải ghi đè tất cả các pt trừu tượng, ko trừu tượng thì tuỳ
    + Ứng dụng làm qui trình 3 bước:  public void stepBefore() {
        //implementation directly in abstract superclass
    }
    public abstract void action(); // implemented by subclasses

    public void stepAfter() {
        //implementation directly in abstract superclass
    }
    + Interface: variable có thể truy cập truc tiep tu lop interface, lớp con ghi đè tất cả pht của lớp cha
      có thể implements nhiều giao diện, tuy nhiên phải ghi đè tất cả phương thức
    So sánh abstract và interface: 
    abtract: có thể có abstract và normal method, đơn kế thừa, biến normal, có thể private
    interface: only abstract method, có thể implements nhiều interfaces, biến auto là static final, auto public
4. 28/5/2023: 1r->5h: collection in java (2h), sql code learn 1h30)
5. Java Collection
  Java Collention interface - root collection interface, ko creat truc tiep Collection a = new Collection()
  some interfaces extend collection type: set, list, sortedset, navigableSet, queue
  So sánh List và Set:
    List: thứ tự, xuất hiện nhièu làn
    Set: xuất hiện 1 lần
    Collection (interface) -> List(interface) -> ArrayList, LinkList, Vector, Stack ( instance)
      - List:
      + list.add(0, "element 4"); chèn phần từ mới vào 0, các phần còn lại bị đẩy tịnh tiến
      + list.get(0) : lay phan tu so 0
      + indexOf: tim index cua phan tu input
      + contains(o): check if contains 
      + remove(index || o ): remove in list
      + clear(): remove all object
      + retain(list): giu lai cac ptu xuat hien trong danh sanh input
      + size(): return list size;
      + sublist(0,1): return list.get(0) only
      + Object[] objects = list.toArray(); return to object
      + Collections.sort(list): sắp xếp  list.add(new People(1.75, "Phong"));
        list.add(new People(1.80, "An"));

        Comparator<People> peopleName =  new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                return Double.compare(o1.height, o2.height) ; // return <0 => nho => lon <=> an>phong
            }
        };
        Collections.sort(list, peopleName);
        System.out.println(list.get(0).name); // Phong
      + LAP MOT LIST: stream.Stream<String> stream = list2.stream();
        stream.forEach(e-> System.out.println(e));
      
      - Set: Collection (interface) -> Set (interface) -> EnumSet, HashSet(), LinkHashSet, TreeSet (instance)
      + hashSet() backed ( ho tro ) hashMap()
      - Map: hashMap() and TreeMap
      

*Project Spring boot

      
      
