package kodlama.io.rentacar.businness.dto.responses.create;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CreateMaintenanceResponse {
    private int id;
    private int carId;
    private Date sendDate;
    private Date returnDate;
}