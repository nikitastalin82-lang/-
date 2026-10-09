package java.game.cars;

import java.game.*;
import java.util.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;

public class Teg_S199 extends Teg_models
{
	public Teg_S199( int id )
	{
		super( id );
		carCategory = PACKAGE;

		makerName = "Einvagen USA";
		vendorName = "Teg";
		model = MODEL_S199;
		modelName = "S199";
		vehicleName = "Einvagen " + vendorName +  " " + modelName;
		name = getName();

		description = "A pure european car from Einvagen Motor Company. Teg S199 is compact, fast and ecologically clean. Good competetion for european market.";

		banned = 1;
		game_version = 2.31;

		value = mHUF2USD(1.466);
		brand_new_prestige_value = 26.30;
 
		fully_stripped_drag = 0.55;

		exhaustSlotIDList = new Vector();
		exhaustSlotIDList.addElement(new Integer(998));

		L_stock_door_slot = 8; //stock driver's door
		R_stock_door_slot = 17; //stock passenger's door

		L_scissor_door_slot = 650; //scissor driver's door
		R_scissor_door_slot = 651; //scissor passenger's door

		L_suicide_door_slot = 653; //suicide driver's door
		R_suicide_door_slot = 652; //suicide passenger's door

		L_butterfly_door_slot = 654; //butterfly driver's door
		R_butterfly_door_slot = 655; //butterfly passenger's door

//		L_custom_door_slot = 658; //custom driver's door
//		R_custom_door_slot = 657; //custom passenger's door
	}

	public void addStockParts( Descriptor desc )
	{
		// stock 1 stuffs //

		stock_parts_list_E  = new int[2];
		stock_parts_list_E[0] = parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000D2r; // "1.8L I4" //
		stock_parts_list_E[1] = parts:0x000053FFr; // "stock battery" //

		stock_parts_list_FL = new int[1];
		stock_parts_list_FL[0] = cars.racers.Teg:0x000000D4r; // "L headlights" //

		stock_parts_list_FR = new int[1];
		stock_parts_list_FR[0] = cars.racers.Teg:0x000000E2r; // "R headlights" //

		stock_parts_list_RL = new int[1];
		stock_parts_list_RL[0] = cars.racers.Teg:0x000000D3r; // "L taillights" //

		stock_parts_list_RR = new int[1];
		stock_parts_list_RR[0] = cars.racers.Teg:0x000000E3r; // "R taillights" //

		stock_parts_list_F  = new int[3];
		stock_parts_list_F[0] = cars.racers.Teg:0x000000D2r; // "F bumper" //
		stock_parts_list_F[1] = cars.racers.Teg:0x000000CFr; // "hood" //
		stock_parts_list_F[2] = cars.racers.Teg:0x000000DCr; // "F windshield" //

		stock_parts_list_Rr = new int[4];
		stock_parts_list_Rr[0] = cars.racers.Teg:0x000000D1r; // "R bumper" //
		stock_parts_list_Rr[1] = cars.racers.Teg:0x000000D7r; // "R seats" //
		stock_parts_list_Rr[2] = cars.racers.Teg:0x000000D5r; // "trunk" //
		stock_parts_list_Rr[3] = cars.racers.Teg:0x000000E1r; // "R windshield" //

		stock_parts_list_L  = new int[6];
		stock_parts_list_L[0] = cars.racers.Teg:0x000000D6r; // "FL door" //
		stock_parts_list_L[1] = cars.racers.Teg:0x000000DFr; // "FL window" //
		stock_parts_list_L[2] = cars.racers.Teg:0x000000E0r; // "RL window" //
		stock_parts_list_L[3] = cars.racers.Teg:0x000000DAr; // "L mirror" //
		stock_parts_list_L[4] = cars.racers.Teg:0x000000E4r; // "FL seat" //
		stock_parts_list_L[5] = cars.racers.Teg:0x000000D0r; // "L sideskirt" //

		stock_parts_list_R  = new int[6];
		stock_parts_list_R[0] = cars.racers.Teg:0x000000D9r; // "FR door" //
		stock_parts_list_R[1] = cars.racers.Teg:0x000000DEr; // "FR window" //
		stock_parts_list_R[2] = cars.racers.Teg:0x000000DDr; // "RR window" //
		stock_parts_list_R[3] = cars.racers.Teg:0x000000DBr; // "R mirror" //
		stock_parts_list_R[4] = cars.racers.Teg:0x000000E5r; // "FR seat" //
		stock_parts_list_R[5] = cars.racers.Teg:0x000000D8r; // "R sideskirt" //

		stg_1_parts_list_FL = new int[1];
		stg_1_parts_list_FL[0] = cars.racers.Teg:0x000000D4r; // "L headlights" //

		stg_1_parts_list_FR = new int[1];
		stg_1_parts_list_FR[0] = cars.racers.Teg:0x000000E2r; // "R headlights" //

		stg_1_parts_list_RL = new int[1];
		stg_1_parts_list_RL[0] = cars.racers.Teg:0x000000D3r; // "L taillights" //

		stg_1_parts_list_RR = new int[1];
		stg_1_parts_list_RR[0] = cars.racers.Teg:0x000000E3r; // "R taillights" //

		stg_1_parts_list_F  = new int[3];
		stg_1_parts_list_F[0] = cars.racers.Teg:0x000000E9r; // "F bumper 2" //
		stg_1_parts_list_F[1] = cars.racers.Teg:0x000000F5r; // "hood 2" //
		stg_1_parts_list_F[2] = cars.racers.Teg:0x000000DCr; // "F windshield" //

		stg_1_parts_list_Rr = new int[5];
		stg_1_parts_list_Rr[0] = cars.racers.Teg:0x000000E8r; // "R bumper 2" //
		stg_1_parts_list_Rr[1] = cars.racers.Teg:0x000000D7r; // "R seats" //
		stg_1_parts_list_Rr[2] = cars.racers.Teg:0x000000D5r; // "trunk" //
		stg_1_parts_list_Rr[3] = cars.racers.Teg:0x000000E1r; // "R windshield" //
		stg_1_parts_list_Rr[4] = parts.wings:0x00000024r; // "R wing" //

		stg_1_parts_list_L  = new int[6];
		stg_1_parts_list_L[0] = cars.racers.Teg:0x000000D6r; // "FL door" //
		stg_1_parts_list_L[1] = cars.racers.Teg:0x000000DFr; // "FL window" //
		stg_1_parts_list_L[2] = cars.racers.Teg:0x000000E0r; // "RL window" //
		stg_1_parts_list_L[3] = cars.racers.Teg:0x000000E4r; // "FL seat" //
		stg_1_parts_list_L[4] = cars.racers.Teg:0x000000E7r; // "L sideskirt 2" //
		stg_1_parts_list_L[5] = cars.racers.Teg:0x000000ECr; // "L mirror 2" //

		stg_1_parts_list_R  = new int[6];
		stg_1_parts_list_R[0] = cars.racers.Teg:0x000000D9r; // "FR door" //
		stg_1_parts_list_R[1] = cars.racers.Teg:0x000000DEr; // "FR window" //
		stg_1_parts_list_R[2] = cars.racers.Teg:0x000000DDr; // "RR window" //
		stg_1_parts_list_R[3] = cars.racers.Teg:0x000000E5r; // "FR seat" //
		stg_1_parts_list_R[4] = cars.racers.Teg:0x000000EAr; // "R sideskirt 2" //
		stg_1_parts_list_R[5] = cars.racers.Teg:0x000000EDr; // "R mirror 2" //

		// running gear parts lists //

		// stock 1 stuffs //

		stock_parts_list_RGear_suspensions = new int[4];
		stock_parts_list_RGear_suspensions[0] = parts:0x0000013Cr; // "Einvagen_GT_FL_McPherson_strut" //
		stock_parts_list_RGear_suspensions[1] = parts:0x0000013Ar; // "Einvagen_GT_FR_McPherson_strut" //
		stock_parts_list_RGear_suspensions[2] = parts:0x00000139r; // "Einvagen_GT_RL_trailing_arm" //
		stock_parts_list_RGear_suspensions[3] = parts:0x00000138r; // "Einvagen_GT_RR_trailing_arm" //

		stock_parts_list_RGear_shocks = new int[4];
		stock_parts_list_RGear_shocks[0] = stock_parts_list_RGear_shocks[1] = parts:0x0000011Er; // "shock_absorber_Einvagen_GT_front" //
		stock_parts_list_RGear_shocks[2] = stock_parts_list_RGear_shocks[3] = parts:0x0000011Br; // "shock_absorber_Einvagen_GT_rear" //

		stock_parts_list_RGear_springs = new int[4];
		stock_parts_list_RGear_springs[0] = stock_parts_list_RGear_springs[1] = parts:0x00000125r; // "spring_Einvagen_GT_front" //
		stock_parts_list_RGear_springs[2] = stock_parts_list_RGear_springs[3] = parts:0x00000123r; // "spring_Einvagen_GT_rear" //

		stock_parts_list_RGear_brakes = new int[4];
		stock_parts_list_RGear_brakes[0] = stock_parts_list_RGear_brakes[1] = parts:0x00000151r; // "brake_Einvagen_GT_front" //
		stock_parts_list_RGear_brakes[2] = stock_parts_list_RGear_brakes[3] = parts:0x00000150r; // "brake_Einvagen_GT_rear" //

		stock_parts_list_RGear_sways = new int[2];
		stock_parts_list_RGear_sways[0] = parts:0x00000185r; // "swaybar_Einvagen_GT_front" //
		stock_parts_list_RGear_sways[1] = parts:0x00000186r; // "swaybar_Einvagen_GT_rear" //

		stock_parts_list_RGear_wheels = new int[4];
		stock_parts_list_RGear_wheels[0] = stock_parts_list_RGear_wheels[1] = parts.wheels:0x000002EEr; // rim_SL_Tuners_DS1_8_0_17_ET_0_LOD_CATALOG_GARAGE
		stock_parts_list_RGear_wheels[2] = stock_parts_list_RGear_wheels[3] = parts.wheels:0x000002EEr; // rim_SL_Tuners_DS1_8_0_17_ET_0_LOD_CATALOG_GARAGE

		stock_parts_list_RGear_tyres = new int[4];
		stock_parts_list_RGear_tyres[0] = stock_parts_list_RGear_tyres[1] = parts.wheels:0x000003DDr; // tyre_225_45_17_9_0_LOD_CATALOG_GARAGE
		stock_parts_list_RGear_tyres[2] = stock_parts_list_RGear_tyres[3] = parts.wheels:0x000003DDr; // tyre_225_45_17_9_0_LOD_CATALOG_GARAGE

		super.addStockParts( desc );

		addPart( cars.racers.Teg:0x0000FFB4r, "steering wheel" );
		addPart( parts.pedals:0x0000BB01r, "stock pedals manual" );

		addPart( cars.racers.Teg:0x000000FBr, "stock_exhaust_pipe" );
		addPart( parts.mufflers:0x0000001Br, "muffler type 08" );
		addPart( parts.mufflers:0x0000001Br, "muffler type 08" );

		if (desc.power > 1.25) addPart( parts.wings:0x00000024r, "wing" );

		if (desc.power > 1.3)
		{
			NOSInjectorSystem N2Oinjector=addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000052r, "NOS injector" );
			N2Oinjector.nitro_consumption = clampTo(N2Oinjector.maxconsumption*((desc.power-1.25)/0.75*0.550+0.150),N2Oinjector.minconsumption,N2Oinjector.maxconsumption);
			
			addPart( parts:0x000001C1r, "12pds canister" );
			addPart( parts:0x000001C1r, "12pds canister" );
			
			if (desc.power > 1.5) addPart( parts:0x000001BFr, "24pds canister" );
		}
	}
}
