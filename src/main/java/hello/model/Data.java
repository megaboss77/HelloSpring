package hello.model;

import org.springframework.data.annotation.Id;

import java.util.List;
import java.util.Objects;

public class Data {
    @Id
    private String id;
    private String category;
    private List<String> food;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<String> getFood() {
        return food;
    }

    public void setFood(List<String> food) {
        this.food = food;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data data = (Data) o;
        return Objects.equals(id, data.id) &&
                Objects.equals(category, data.category) &&
                Objects.equals(food, data.food);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category, food);
    }
}
