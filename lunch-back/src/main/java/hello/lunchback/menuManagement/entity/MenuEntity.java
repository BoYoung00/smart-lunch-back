package hello.lunchback.menuManagement.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import hello.lunchback.menuManagement.dto.request.PostMenuAddRequestDto;
import hello.lunchback.menuManagement.dto.request.PostMenuUpdateRequestDto;
import hello.lunchback.storeManagement.entity.StoreEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "menu")
@NoArgsConstructor
@Setter
@Getter
public class MenuEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer menuId;
    @ManyToOne
    @JsonIgnore
    private StoreEntity store;
    private String menuName;
    private String menuImage;
    @Column(columnDefinition = "TEXT")
    private String menuDescription;
    private Integer menuPrice;
    private Integer calorie;
    private Integer carbs;
    private Integer protein;
    private Integer fat;
    private Integer isSoldOut;

    public MenuEntity(PostMenuAddRequestDto dto) {
        this.menuName = dto.getName();
        this.menuDescription = dto.getDescription();
        this.menuPrice = dto.getPrice();
        this.calorie = dto.getCalorie();
        this.carbs = dto.getCarbs();
        this.protein = dto.getProtein();
        this.fat = dto.getFat();
        this.isSoldOut = dto.getIsSoldOut();
    }


    public void setStore(StoreEntity storeEntity) {
        this.store = storeEntity;
    }

    public void update(PostMenuUpdateRequestDto dto, String saveFile) {
        this.menuName = dto.getName();
        this.menuDescription = dto.getDescription();
        this.menuPrice = dto.getPrice();
        this.calorie = dto.getCalorie();
        this.carbs = dto.getCarbs();
        this.protein = dto.getProtein();
        this.fat = dto.getFat();
        this.menuImage = saveFile;
    }
}
