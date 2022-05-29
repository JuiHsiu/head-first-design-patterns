package iterator;

import java.util.List;

public class PancakeHouseMenuIterator implements Iterator {
    List<MenuItem> items;
    int position = 0;

    public PancakeHouseMenuIterator(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
//        if (position >= items.size()) {
//            return false;
//        } else {
//            return true;
//        }
        return position < items.size();
    }

    @Override
    public MenuItem next() {
//        MenuItem menuItem = items.get(position);
//        position = position + 1;
//        return menuItem;
        return items.get(position++);
    }
}
