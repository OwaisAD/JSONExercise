package DTOs;

import java.util.List;

public class UsersDTO {
    private List<UserDTO> data;
    private int total;
    private int page;
    private int limit;

    public UsersDTO(List<UserDTO> data, int total, int page, int limit) {
        this.data = data;
        this.total = total;
        this.page = page;
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "UsersDTO{" +
                "data=" + data +
                ", total=" + total +
                ", page=" + page +
                ", limit=" + limit +
                '}';
    }
}
