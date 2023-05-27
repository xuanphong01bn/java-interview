# java-interview
1. OOP:
2. 28/5/2023: 1r->5h: collection in java (2h), sql code learn 1h30)
3. Java Collection
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
      
      
      
