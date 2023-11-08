package bookingcare.entity;

import jakarta.persistence.*;

@Entity
//@Table(name="schedules")// lich kham
public class Schedules {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
	
	@Column(name = "date")
    private String date;

	@Column(name = "status")
    private String status;
	
	@Column(name = "time_start")
    private String timeStart;
	
	@Column(name = "time_end")
    private String timeEnd;
	
	@Column(name = "number_patient")
    private String numberPatient;
	
	@Column(name = "price")
    private String price;
	
//	@ManyToOne
//    @JoinColumn(name = "doctor_id")
//    private Docter docter;
}
