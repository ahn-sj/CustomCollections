## 배열 리스트(ArrayList)와 연결 리스트(LinkedList)

### 연결 리스트(Linked List)

---

연결리스트는 각 노드가 데이터와 포인터를 가지고 한 줄로 연결되어 있는 방식의 자료구조이다. 시간복잡도 O(n)

![img_3.png](img/img_3.png)
이미지 출처: [생활코딩](https://opentutorials.org/module/1335/8857)


연결리스트는 기본적으로 노드(Node)라는 구조체를 기본으로 한다. 그리고 이 노드는 데이터를 담는 칸과 다음 노드의 주소를 가리키는 칸으로 이루어져있다.

이러한 구조때문에 연결리스트는 다음과 같은 특징을 갖는다.

1. 데이터의 이동없이 중간에 삽입/삭제가 가능하다. <br/>
2. 랜덤엑세스가 불가능하다.
3. Head의 주소는 반드시 기억해야 한다.

이제 LinkedList의 연산에 대해서 알아보자.
1. 삽입 연산<br/>
기존 배열리스트와는 다르게 데이터 삽입시에 원하는 위치보다 한 칸 앞의 노드의 주소값을 새로운 노드의 주소값으로 변경한다. <br/>
이러한 연산때문에 배열리스트에 비해 매우 유연하게 연산을 수행할 수 있다.
2. 삭제 연산<br/>
기존 배열리스트와 다르게 이전 원소들을 전부 옮겨 담을 필요없이 삭제하기를 원하는 노드의 앞 노드와 뒤 노드를 이어주고, 원하는 노드를 메모리에서 해제해주면 된다.
3. 탐색 연산<br/>
데이터들이 모두 떨어져서 저장되어있기 때문에 랜덤엑세스를 할 수 없다. 때문에 n번째 원소를 찾으려면 n번의 루프를 돌아야 한다. <br/>
이러한 이유때문에 연결리스트의 시간복잡도는 O(n)이다.
