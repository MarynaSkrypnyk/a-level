package org.example.deepcopy;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address implements Cloneable{
    private String adress;
    @Override
    public String toString() {
        return adress;
    }
}
