package java.game.cars;

import java.game.*;
import java.util.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;

public class Emer_MotorSport_Nonus_DTM extends Emer_models
{
	public Emer_MotorSport_Nonus_DTM( int id )
	{
		super( id );
		carCategory = PACKAGE;

		makerName = "Emer MotorSport Division";
		vendorName = "Nonus";
		model = MODEL_MOTORSPORT_NONUS_DTM;
		modelName = "DTM";
		vehicleName = "Emer MotorSport " + vendorName + " " + modelName;
		name = getName();

		description = "Emer MotorSport Division became a competetor for Baiern Gmbh on the DTM championship in 2006 with their Nonus DTM racecar. A more street-looking, but fast and durable, this car became a good rival for the pure-racing Baiern CoupeSport DTM.";

		banned = 1;
		game_version = 2.31;

		value = mHUF2USD(158.250);
		brand_new_prestige_value = 85.10;

		fully_stripped_drag = 0.61;
		brake_balance_can_be_set = 1;

		exhaustSlotIDList = new Vector();
		exhaustSlotIDList.addElement(new Integer(995));
		exhaustSlotIDList.addElement(new Integer(996));

		L_stock_door_slot = 5; //stock driver's door
		R_stock_door_slot = 22; //stock passenger's door
	}

	public void addStockParts( Descriptor desc )
	{
		// stock 1 stuffs //

		stock_parts_list_FL = new int[3];
		stock_parts_list_FL[0] = cars.racers.nonus:0x0000F339r; // "L headlights 3" //
		stock_parts_list_FL[1] = cars.racers.nonus:0x0000F307r; // "FL quarterpanel 3" //
		stock_parts_list_FL[2] = cars.racers.nonus:0x0000F323r; // "L sideskirt 3" //

		stock_parts_list_FR = new int[3];
		stock_parts_list_FR[0] = cars.racers.nonus:0x0000F343r; // "R headlights 3" //
		stock_parts_list_FR[1] = cars.racers.nonus:0x0000F311r; // "FR quarterpanel 3" //
		stock_parts_list_FR[2] = cars.racers.nonus:0x0000F327r; // "R sideskirt 3" //

		stock_parts_list_RL = new int[2];
		stock_parts_list_RL[0] = cars.racers.nonus:0x0000009Dr; // "L taillights" //
		stock_parts_list_RL[1] = cars.racers.nonus:0x0000F315r; // "RL quarterpanel 3" //


		stock_parts_list_RR = new int[2];
		stock_parts_list_RR[0] = cars.racers.nonus:0x000000A7r; // "R taillights" //
		stock_parts_list_RR[1] = cars.racers.nonus:0x0000F319r; // "RR quarterpanel 3" //

		stock_parts_list_F  = new int[4];
		stock_parts_list_F[0] = cars.racers.nonus:0x0000F303r; // "F bumper 4" //
		stock_parts_list_F[1] = cars.racers.nonus:0x00000108r; // "hood" //
		stock_parts_list_F[2] = cars.racers.nonus:0x000000A2r; // "F windshield" //
		stock_parts_list_F[3] = cars.racers.nonus:0x0000F347r; // "rollcage" //

		stock_parts_list_Rr = new int[4];
		stock_parts_list_Rr[0] = cars.racers.nonus:0x0000F331r; // "R bumper 4" //
		stock_parts_list_Rr[1] = cars.racers.nonus:0x0000F335r; // "trunk 2" //
		stock_parts_list_Rr[2] = cars.racers.nonus:0x0000F351r; // "R wing" //
		stock_parts_list_Rr[3] = cars.racers.nonus:0x00000094r; // "R windshield" //

		stock_parts_list_L  = new int[3];
		stock_parts_list_L[0] = cars.racers.nonus:0x0000F355r; // "FL door 2" //
		stock_parts_list_L[1] = cars.racers.nonus:0x00000096r; // "RL window" //
		stock_parts_list_L[2] = parts.interior:0x0000004Dr; // "FL seat: seat_Torino.class" //

		stock_parts_list_R  = new int[3];
		stock_parts_list_R[0] = cars.racers.nonus:0x0000F359r; // "FR door 2" //
		stock_parts_list_R[1] = cars.racers.nonus:0x000000A5r; // "RR window" //
		stock_parts_list_R[2] = parts.interior:0x0000004Dr; // "FR seat: seat_Torino.class" //

//=================================DTM ENGINE START

		stock_parts_list_E  = new int[27];
		stock_parts_list_E[0] = parts.engines.MC_Prime_SuperDuty:0x0000D03Fr; // "DTM_block" //
		stock_parts_list_E[1] = parts.engines.MC_Prime_SuperDuty:0x0000D03Er; // "DTM_crankshaft" //
		stock_parts_list_E[2] = parts.engines.MC_Prime_SuperDuty:0x0000D0FFr; // "DTM_connecting_rods" //
		stock_parts_list_E[3] = parts.engines.MC_Prime_SuperDuty:0x0000D102r; // "DTM_pistons" //
		stock_parts_list_E[4] = parts.engines.MC_Prime_SuperDuty:0x0000D104r; // "DTM_transmission" //
		stock_parts_list_E[5] = parts.engines.MC_Prime_SuperDuty:0x00000083r; // "DLH_flywheel" //
		stock_parts_list_E[6] = parts.engines.MC_Prime_SuperDuty:0x00000084r; // "DLH_clutch" //
		stock_parts_list_E[7] = parts.engines.MC_Prime_SuperDuty:0x0000009Br; // "DLH_crankshaft_bearing_bridge" //
		stock_parts_list_E[8] = parts.engines.MC_Prime_SuperDuty:0x00000095r; // "DLH_oil_pan" //
		stock_parts_list_E[9] = parts.engines.MC_Prime_SuperDuty:0x00000097r; // "DLH_alternator_drive_belt" //
		stock_parts_list_E[10] = parts.engines.MC_Prime_SuperDuty:0x00000096r; // "DLH_alternator" //
		stock_parts_list_E[11] = parts.engines.MC_Prime_SuperDuty:0x00000043r; // "DLH_camshaft_drive_belt" //
		stock_parts_list_E[12] = parts.engines.MC_Prime_SuperDuty:0x00000040r; // "DLH_L_cylinder_head" //
		stock_parts_list_E[13] = parts.engines.MC_Prime_SuperDuty:0x00000041r; // "DLH_R_cylinder_head" //
		stock_parts_list_E[14] = parts.engines.MC_Prime_SuperDuty:0x00000046r; // "DLH_L_exhaust_header" //
		stock_parts_list_E[15] = parts.engines.MC_Prime_SuperDuty:0x00000045r; // "DLH_R_exhaust_header" //
		stock_parts_list_E[16] = parts.engines.MC_Prime_SuperDuty:0x0000004Er; // "DLH_L_exhaust_camshaft" //
		stock_parts_list_E[17] = parts.engines.MC_Prime_SuperDuty:0x00000051r; // "DLH_R_exhaust_camshaft" //
		stock_parts_list_E[18] = parts.engines.MC_Prime_SuperDuty:0x0000004Dr; // "DLH_L_intake_camshaft" //
		stock_parts_list_E[19] = parts.engines.MC_Prime_SuperDuty:0x00000050r; // "DLH_R_intake_camshaft" //
		stock_parts_list_E[20] = parts.engines.MC_Prime_SuperDuty:0x0000004Fr; // "DLH_L_camshaft_bearing_bridge" //
		stock_parts_list_E[21] = parts.engines.MC_Prime_SuperDuty:0x00000052r; // "DLH_R_camshaft_bearing_bridge" //
		stock_parts_list_E[22] = parts.engines.MC_Prime_SuperDuty:0x00000042r; // "DLH_L_cylinder_head_cover" //
		stock_parts_list_E[23] = parts.engines.MC_Prime_SuperDuty:0x00000044r; // "DLH_R_cylinder_head_cover" //
		stock_parts_list_E[24] = parts.engines.MC_Prime_SuperDuty:0x0000008Ar; // "DLH_intake_manifold" //
		stock_parts_list_E[25] = parts.engines.MC_Prime_SuperDuty:0x0000008Br; // "DLH_carburetors" //
		stock_parts_list_E[26] = parts:0x000053FFr; // "stock battery" //

//=================================DTM ENGINE END

		stock_parts_list_RGear_suspensions = new int[4];
		stock_parts_list_RGear_suspensions[0] = parts:0x000000F4r; // "Baiern_GT_FL_McPherson_strut" //
		stock_parts_list_RGear_suspensions[1] = parts:0x000000F5r; // "Baiern_GT_FR_McPherson_strut" //
		stock_parts_list_RGear_suspensions[2] = parts:0x000000F6r; // "Baiern_GT_RL_trailing_arm" //
		stock_parts_list_RGear_suspensions[3] = parts:0x000000F7r; // "Baiern_GT_RR_trailing_arm" //

		stock_parts_list_RGear_shocks = new int[4];
		stock_parts_list_RGear_shocks[0] = stock_parts_list_RGear_shocks[1] = parts:0x000000ECr; // "shock_absorber_Baiern_GT_front" //
		stock_parts_list_RGear_shocks[2] = stock_parts_list_RGear_shocks[3] = parts:0x000000EDr; // "shock_absorber_Baiern_GT_rear" //

		stock_parts_list_RGear_springs = new int[4];
		stock_parts_list_RGear_springs[0] = stock_parts_list_RGear_springs[1] = parts:0x000000F2r; // "spring_Baiern_GT_front" //
		stock_parts_list_RGear_springs[2] = stock_parts_list_RGear_springs[3] = parts:0x000000F3r; // "spring_Baiern_GT_rear" //

		stock_parts_list_RGear_brakes = new int[4];
		stock_parts_list_RGear_brakes[0] = stock_parts_list_RGear_brakes[1] = parts:0x000000DAr; // "brake_Baiern_GT_front" //
		stock_parts_list_RGear_brakes[2] = stock_parts_list_RGear_brakes[3] = parts:0x000000DBr; // "brake_Baiern_GT_rear" //

		stock_parts_list_RGear_sways = new int[2];
		stock_parts_list_RGear_sways[0] = parts:0x0000021Dr; // "swaybar_Baiern_GT_front" //
		stock_parts_list_RGear_sways[1] = parts:0x0000021Er; // "swaybar_Baiern_GT_rear" //

		stock_parts_list_RGear_wheels = new int[4];
		stock_parts_list_RGear_wheels[0] = stock_parts_list_RGear_wheels[1] = parts.wheels:0x00000400r; // "rim Baiern_DTM 11.0 19 ET -25 LOD CATALOG GARAGE" //
		stock_parts_list_RGear_wheels[2] = stock_parts_list_RGear_wheels[3] = parts.wheels:0x00000400r; // "rim Baiern_DTM 13.0 19 ET -40 LOD CATALOG GARAGE" //

		stock_parts_list_RGear_tyres = new int[4];
		stock_parts_list_RGear_tyres[0] = stock_parts_list_RGear_tyres[1] = parts.wheels:0x00000404r; // "tyre 255 25 19 11.0 LOD CATALOG GARAGE" //
		stock_parts_list_RGear_tyres[2] = stock_parts_list_RGear_tyres[3] = parts.wheels:0x00000404r; // "tyre 295 20 19 13.0 LOD CATALOG GARAGE" //

		super.addStockParts( desc );

		addPart( parts.interior:0x00000013r, "steering wheel" ); //steering_wheel_Extreme.class
		addPart( parts.pedals:0x0000BB01r, "stock pedals manual" );

		addPart( cars.racers.Nonus:0x0000D0E5r, "L_DTM_exhaust_pipe" );
		addPart( cars.racers.Nonus:0x0000E0E5r, "R_DTM_exhaust_pipe" );
		addPart( cars.racers.Nonus:0x0000F0E5r, "DTM_muffler" );
		addPart( cars.racers.Nonus:0x0000F0E5r, "DTM_muffler" );
		addPart( cars.racers.Nonus:0x0000F0E5r, "DTM_muffler" );
		addPart( cars.racers.Nonus:0x0000F0E5r, "DTM_muffler" );
	}
}
