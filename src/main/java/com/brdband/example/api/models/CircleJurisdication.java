package com.brdband.example.api.models;


import javax.persistence.*;

@Entity
@Table(name = "CIRCLE_JURISDICATION")
public class CircleJurisdication {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "circleId", updatable = false, nullable = false)
    private Long circleId;

    @Column(name = "zipCode")
    private String zipCode;

    @Column(name = "circleName")
    private String circleName;

    public CircleJurisdication(){}

    public CircleJurisdication(String zipCode, String circleName){
        this.zipCode = zipCode;
        this.circleName = circleName;
    }

    public void setCircleId(Long circleId){
        this.circleId = circleId;
    }

    public Long getCircleId(){
        return this.circleId;
    }

    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }

    public String getZipCode(){
        return this.zipCode;
    }

    public String getCircleName() {
        return circleName;
    }

    public void setCircleName(String circleName) {
        this.circleName = circleName;
    }
}
