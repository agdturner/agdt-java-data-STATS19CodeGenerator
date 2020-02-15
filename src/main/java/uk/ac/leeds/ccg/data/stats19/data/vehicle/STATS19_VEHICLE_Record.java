/*
 * Source code generated by uk.ac.leeds.ccg.data.stats19.process.STATS19_JavaCodeGenerator
 */
package uk.ac.leeds.ccg.data.stats19.data.vehicle;

import uk.ac.leeds.ccg.data.Data_Record;
import uk.ac.leeds.ccg.data.stats19.data.id.STATS19_RecordID;

public class STATS19_VEHICLE_Record extends Data_Record {

    private static final long serialVersionUID = 1L;

    protected String tAcc_Index;
    protected Byte tVehicle_Reference;
    protected Byte tVehicle_Type;
    protected Byte tTowing_and_Articulation;
    protected Byte tVehicle_Manoeuvre;
    protected Byte tVehicle_Location_Restricted_Lane;
    protected Byte tJunction_Location;
    protected Byte tSkidding_and_Overturning;
    protected Byte tHit_Object_in_Carriageway;
    protected Byte tVehicle_Leaving_Carriageway;
    protected Byte tHit_Object_off_Carriageway;
    protected Byte t1st_Point_of_Impact;
    protected Byte tWas_Vehicle_Left_Hand_Drive;
    protected Byte tJourney_Purpose_of_Driver;
    protected Byte tSex_of_Driver;
    protected Byte tAge_Band_of_Driver;
    protected Short tEngine_Capacity_CC;
    protected Byte tPropulsion_Code;
    protected Byte tAge_of_Vehicle;
    protected Byte tDriver_IMD_Decile;
    protected Byte tDriver_Home_Area_Type;

    public STATS19_VEHICLE_Record(STATS19_RecordID i, String line) throws Exception {
        super(i);
        String[] s = line.split(",");
        inittAcc_Index(s[0]);
        inittVehicle_Reference(s[1]);
        inittVehicle_Type(s[2]);
        inittTowing_and_Articulation(s[3]);
        inittVehicle_Manoeuvre(s[4]);
        inittVehicle_Location_Restricted_Lane(s[5]);
        inittJunction_Location(s[6]);
        inittSkidding_and_Overturning(s[7]);
        inittHit_Object_in_Carriageway(s[8]);
        inittVehicle_Leaving_Carriageway(s[9]);
        inittHit_Object_off_Carriageway(s[10]);
        initt1st_Point_of_Impact(s[11]);
        inittWas_Vehicle_Left_Hand_Drive(s[12]);
        inittJourney_Purpose_of_Driver(s[13]);
        inittSex_of_Driver(s[14]);
        inittAge_Band_of_Driver(s[15]);
        inittEngine_Capacity_CC(s[16]);
        inittPropulsion_Code(s[17]);
        inittAge_of_Vehicle(s[18]);
        inittDriver_IMD_Decile(s[19]);
        inittDriver_Home_Area_Type(s[20]);
    }

    @Override
    public STATS19_RecordID getID() {
        return (STATS19_RecordID) id;
    }

    protected final void inittAcc_Index(String s) {
        if (!s.trim().isEmpty()) {
            tAcc_Index = s;
        } else {
            tAcc_Index = null;
        }
    }

    protected final void inittVehicle_Reference(String s) {
        if (!s.trim().isEmpty()) {
            tVehicle_Reference = Byte.parseByte(s);
        } else {
            tVehicle_Reference = null;
        }
    }

    protected final void inittVehicle_Type(String s) {
        if (!s.trim().isEmpty()) {
            tVehicle_Type = Byte.parseByte(s);
        } else {
            tVehicle_Type = null;
        }
    }

    protected final void inittTowing_and_Articulation(String s) {
        if (!s.trim().isEmpty()) {
            tTowing_and_Articulation = Byte.parseByte(s);
        } else {
            tTowing_and_Articulation = null;
        }
    }

    protected final void inittVehicle_Manoeuvre(String s) {
        if (!s.trim().isEmpty()) {
            tVehicle_Manoeuvre = Byte.parseByte(s);
        } else {
            tVehicle_Manoeuvre = null;
        }
    }

    protected final void inittVehicle_Location_Restricted_Lane(String s) {
        if (!s.trim().isEmpty()) {
            tVehicle_Location_Restricted_Lane = Byte.parseByte(s);
        } else {
            tVehicle_Location_Restricted_Lane = null;
        }
    }

    protected final void inittJunction_Location(String s) {
        if (!s.trim().isEmpty()) {
            tJunction_Location = Byte.parseByte(s);
        } else {
            tJunction_Location = null;
        }
    }

    protected final void inittSkidding_and_Overturning(String s) {
        if (!s.trim().isEmpty()) {
            tSkidding_and_Overturning = Byte.parseByte(s);
        } else {
            tSkidding_and_Overturning = null;
        }
    }

    protected final void inittHit_Object_in_Carriageway(String s) {
        if (!s.trim().isEmpty()) {
            tHit_Object_in_Carriageway = Byte.parseByte(s);
        } else {
            tHit_Object_in_Carriageway = null;
        }
    }

    protected final void inittVehicle_Leaving_Carriageway(String s) {
        if (!s.trim().isEmpty()) {
            tVehicle_Leaving_Carriageway = Byte.parseByte(s);
        } else {
            tVehicle_Leaving_Carriageway = null;
        }
    }

    protected final void inittHit_Object_off_Carriageway(String s) {
        if (!s.trim().isEmpty()) {
            tHit_Object_off_Carriageway = Byte.parseByte(s);
        } else {
            tHit_Object_off_Carriageway = null;
        }
    }

    protected final void initt1st_Point_of_Impact(String s) {
        if (!s.trim().isEmpty()) {
            t1st_Point_of_Impact = Byte.parseByte(s);
        } else {
            t1st_Point_of_Impact = null;
        }
    }

    protected final void inittWas_Vehicle_Left_Hand_Drive(String s) {
        if (!s.trim().isEmpty()) {
            tWas_Vehicle_Left_Hand_Drive = Byte.parseByte(s);
        } else {
            tWas_Vehicle_Left_Hand_Drive = null;
        }
    }

    protected final void inittJourney_Purpose_of_Driver(String s) {
        if (!s.trim().isEmpty()) {
            tJourney_Purpose_of_Driver = Byte.parseByte(s);
        } else {
            tJourney_Purpose_of_Driver = null;
        }
    }

    protected final void inittSex_of_Driver(String s) {
        if (!s.trim().isEmpty()) {
            tSex_of_Driver = Byte.parseByte(s);
        } else {
            tSex_of_Driver = null;
        }
    }

    protected final void inittAge_Band_of_Driver(String s) {
        if (!s.trim().isEmpty()) {
            tAge_Band_of_Driver = Byte.parseByte(s);
        } else {
            tAge_Band_of_Driver = null;
        }
    }

    protected final void inittEngine_Capacity_CC(String s) {
        if (!s.trim().isEmpty()) {
            tEngine_Capacity_CC = Short.parseShort(s);
        } else {
            tEngine_Capacity_CC = null;
        }
    }

    protected final void inittPropulsion_Code(String s) {
        if (!s.trim().isEmpty()) {
            tPropulsion_Code = Byte.parseByte(s);
        } else {
            tPropulsion_Code = null;
        }
    }

    protected final void inittAge_of_Vehicle(String s) {
        if (!s.trim().isEmpty()) {
            tAge_of_Vehicle = Byte.parseByte(s);
        } else {
            tAge_of_Vehicle = null;
        }
    }

    protected final void inittDriver_IMD_Decile(String s) {
        if (!s.trim().isEmpty()) {
            tDriver_IMD_Decile = Byte.parseByte(s);
        } else {
            tDriver_IMD_Decile = null;
        }
    }

    protected final void inittDriver_Home_Area_Type(String s) {
        if (!s.trim().isEmpty()) {
            tDriver_Home_Area_Type = Byte.parseByte(s);
        } else {
            tDriver_Home_Area_Type = null;
        }
    }

    public String gettAcc_Index() {
        return tAcc_Index;
    }

    public Byte gettVehicle_Reference() {
        return tVehicle_Reference;
    }

    public Byte gettVehicle_Type() {
        return tVehicle_Type;
    }

    public Byte gettTowing_and_Articulation() {
        return tTowing_and_Articulation;
    }

    public Byte gettVehicle_Manoeuvre() {
        return tVehicle_Manoeuvre;
    }

    public Byte gettVehicle_Location_Restricted_Lane() {
        return tVehicle_Location_Restricted_Lane;
    }

    public Byte gettJunction_Location() {
        return tJunction_Location;
    }

    public Byte gettSkidding_and_Overturning() {
        return tSkidding_and_Overturning;
    }

    public Byte gettHit_Object_in_Carriageway() {
        return tHit_Object_in_Carriageway;
    }

    public Byte gettVehicle_Leaving_Carriageway() {
        return tVehicle_Leaving_Carriageway;
    }

    public Byte gettHit_Object_off_Carriageway() {
        return tHit_Object_off_Carriageway;
    }

    public Byte gett1st_Point_of_Impact() {
        return t1st_Point_of_Impact;
    }

    public Byte gettWas_Vehicle_Left_Hand_Drive() {
        return tWas_Vehicle_Left_Hand_Drive;
    }

    public Byte gettJourney_Purpose_of_Driver() {
        return tJourney_Purpose_of_Driver;
    }

    public Byte gettSex_of_Driver() {
        return tSex_of_Driver;
    }

    public Byte gettAge_Band_of_Driver() {
        return tAge_Band_of_Driver;
    }

    public Short gettEngine_Capacity_CC() {
        return tEngine_Capacity_CC;
    }

    public Byte gettPropulsion_Code() {
        return tPropulsion_Code;
    }

    public Byte gettAge_of_Vehicle() {
        return tAge_of_Vehicle;
    }

    public Byte gettDriver_IMD_Decile() {
        return tDriver_IMD_Decile;
    }

    public Byte gettDriver_Home_Area_Type() {
        return tDriver_Home_Area_Type;
    }
}
