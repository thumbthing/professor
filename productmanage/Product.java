package network.productmanage;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok. NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
//@Builder
public class Product {
    public int no;
    public String name;
    public int price;
    public int stock;
}