# 裝飾器模式 (Decorator pattern)
## 物件導向原則
* 把會變的東西封裝起來。
* 多用組合，少用繼承。
* 針對介面撰寫程式，而不是針對實作。
* 努力為彼此互動的物件做出鬆耦合的設計。
* *開放/封閉原則：類別應該歡迎擴展，但拒絕修改。*

## 物件導向模式
* 裝飾器模式
  * 將額外的職責動態地附加到一個物件。使用裝飾器來擴展功能比使用繼承更有彈性。

## 重點提示
* 繼承是一種擴展的形式，但不一定是實現靈活設計的最佳手段。
* 在設計中，我們應該讓行為可以在不必修改既有程式的情況下擴展。
* 我們可以經常使用組合與委託，在執行期加入新行為。
* 除了繼承之外，裝飾器模式也可以用來擴展行為。
* 裝飾器模式使用一組裝飾器類別來包裝具體組件。
* 裝飾器類別的型態與被它們裝飾的組件的型態相映 (事實上，它們的型態與被它們裝飾的組件的型態一樣，也許是透過繼承，也許是透過介面實作)。
* 裝飾器改變組件行為的做法是在呼叫組件的方法之前或之後加入新功能 (甚至取代那個方法)。
* 你可以用任意數量的裝飾器來包裝組件。
* 裝飾器對組件的用戶端來說通常是透明的，除非用戶端依賴組件的具體型態。
* 裝飾器可能讓設計有許多小物件，濫用它會讓設計變複雜。