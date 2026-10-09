package java.game.cars;

import java.game.*;
import java.util.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;

public class Remo_1_8 extends Remo_models
{
	public Remo_1_8( int id )
	{
		super( id );
		carCategory = PACKAGE;

		makerName = "Einvagen USA";
		vendorName = "Remo";
		model = MODEL_1_8;
		modelName = "1.8L";
		vehicleName = "Einvagen " + vendorName + " " + modelName;
		name = getName();

		description = "Einvagen Motor Company have launched the production of theese cars for the first time far in 80's. But since that time they've realized the popularity of Remo series and left 2 models on production till the present time. The first model in the modern line is a Remo 1.8L, it's a classic Einvagen car with the cubic shapes and a light chassis.";

		banned = 1;
		game_version = 2.31;

		value = mHUF2USD(1.430);
		brand_new_prestige_value = 21.66;
 
		fully_stripped_drag = 0.55;

		exhaustSlotIDList = new Vector();
		exhaustSlotIDList.addElement(new Integer(39));

		L_stock_door_slot = 5; //stock driver's door
		R_stock_door_slot = 8; //stock passenger's door

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
		stock_parts_list_FL[0] = cars.racers.Remo:0x000000C2r; // "L headlights" //

		stock_parts_list_FR = new int[1];
		stock_parts_list_FR[0] = cars.racers.Remo:0x000000CAr; // "R headlights" //

		stock_parts_list_RL = new int[1];
		stock_parts_list_RL[0] = cars.racers.Remo:0x000000C6r; // "L taillights" //

		stock_parts_list_RR = new int[1];
		stock_parts_list_RR[0] = cars.racers.Remo:0x000000CFr; // "R taillights" //

		stock_parts_list_F  = new int[4];
		stock_parts_list_F[0] = cars.racers.Remo:0x000000B4r; // "F bumper" //
		stock_parts_list_F[1] = cars.racers.Remo:0x000000B7r; // "F_grill" //
		stock_parts_list_F[2] = cars.racers.Remo:0x000000B9r; // "F windshield" //
		stock_parts_list_F[3] = cars.racers.Remo:0x000000BFr; // "hood" //

		stock_parts_list_Rr = new int[5];
		stock_parts_list_Rr[0] = cars.racers.Remo:0x000000C7r; // "R bumper" //
		stock_parts_list_Rr[1] = cars.racers.Remo:0x000000CCr; // "R seats" //
		stock_parts_list_Rr[2] = cars.racers.Remo:0x000000D4r; // "trunk" //
		stock_parts_list_Rr[3] = cars.racers.Remo:0x000000D1r; // "R wing" //
		stock_parts_list_Rr[4] = cars.racers.Remo:0x000000D0r; // "R windshield" //

		stock_parts_list_L  = new int[6];
		stock_parts_list_L[0] = cars.racers.Remo:0x000000BAr; // "FL door" //
		stock_parts_list_L[1] = cars.racers.Remo:0x000000BBr; // "FL seat" //
		stock_parts_list_L[2] = cars.racers.Remo:0x000000D9r; // "FL window" //
		stock_parts_list_L[3] = cars.racers.Remo:0x000000D2r; // "RL window" //
		stock_parts_list_L[4] = cars.racers.Remo:0x000000C4r; // "L sideskirt" //
		stock_parts_list_L[5] = cars.racers.Remo:0x000000C3r; // "L mirror" //

		stock_parts_list_R  = new int[6];
		stock_parts_list_R[0] = cars.racers.Remo:0x000000BCr; // "FR door" //
		stock_parts_list_R[1] = cars.racers.Remo:0x000000BDr; // "FR seat" //
		stock_parts_list_R[2] = cars.racers.Remo:0x000000BEr; // "FR window" //
		stock_parts_list_R[3] = cars.racers.Remo:0x000000D3r; // "RR window" //
		stock_parts_list_R[4] = cars.racers.Remo:0x000000CDr; // "R sideskirt" //
		stock_parts_list_R[5] = cars.racers.Remo:0x000000CBr; // "R mirror" //

		stg_1_parts_list_F  = new int[4];
		stg_1_parts_list_F[0] = cars.racers.Remo:0x000000B5r; // "F bumper 2" //
		stg_1_parts_list_F[1] = cars.racers.Remo:0x000000C0r; // "hood 2" //
		stg_1_parts_list_F[2] = cars.racers.Remo:0x000000B8r; // "F_grill 2" //
		stg_1_parts_list_F[3] = cars.racers.Remo:0x000000B9r; // "F windshield" //

		stg_1_parts_list_Rr = new int[5];
		stg_1_parts_list_Rr[0] = cars.racers.Remo:0x000000C8r; // "R bumper 2" //
		stg_1_parts_list_Rr[1] = cars.racers.Remo:0x000000CCr; // "R seats" //
		stg_1_parts_list_Rr[2] = cars.racers.Remo:0x000000D4r; // "trunk" //
		stg_1_parts_list_Rr[3] = cars.racers.Remo:0x000000D1r; // "R wing" //
		stg_1_parts_list_Rr[4] = cars.racers.Remo:0x000000D0r; // "R windshield" //

		stg_1_parts_list_L  = new int[6];
		stg_1_parts_list_L[0] = cars.racers.Remo:0x000000BAr; // "FL door" //
		stg_1_parts_list_L[1] = cars.racers.Remo:0x000000BBr; // "FL seat" //
		stg_1_parts_list_L[2] = cars.racers.Remo:0x000000D9r; // "FL window" //
		stg_1_parts_list_L[3] = cars.racers.Remo:0x000000D2r; // "RL window" //
		stg_1_parts_list_L[4] = cars.racers.Remo:0x000000C5r; // "L sideskirt 2" //
		stg_1_parts_list_L[5] = cars.racers.Remo:0x000000C3r; // "L mirror" //

		stg_1_parts_list_R  = new int[6];
		stg_1_parts_list_R[0] = cars.racers.Remo:0x000000BCr; // "FR door" //
		stg_1_parts_list_R[1] = cars.racers.Remo:0x000000BDr; // "FR seat" //
		stg_1_parts_list_R[2] = cars.racers.Remo:0x000000BEr; // "FR window" //
		stg_1_parts_list_R[3] = cars.racers.Remo:0x000000D3r; // "RR window" //
		stg_1_parts_list_R[4] = cars.racers.Remo:0x000000CEr; // "R sideskirt 2" //
		stg_1_parts_list_R[5] = cars.racers.Remo:0x000000CBr; // "R mirror" //

		// running gear parts lists //

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
		stock_parts_list_RGear_wheels[0] = stock_parts_list_RGear_wheels[1] = parts.wheels:0x000002B4r; // "rim Einvagen_GT 7.0 16 ET 20 LOD CATALOG GARAGE" //
		stock_parts_list_RGear_wheels[2] = stock_parts_list_RGear_wheels[3] = parts.wheels:0x000002B4r; // "rim Einvagen_GT 7.0 16 ET 20 LOD CATALOG GARAGE" //

		stock_parts_list_RGear_tyres = new int[4];
		stock_parts_list_RGear_tyres[0] = stock_parts_list_RGear_tyres[1] = parts.wheels:0x000003CFr; // "tyre 195 50 16 7.5 LOD CATALOG GARAGE" //
		stock_parts_list_RGear_tyres[2] = stock_parts_list_RGear_tyres[3] = parts.wheels:0x000003CFr; // "tyre 195 50 16 7.5 LOD CATALOG GARAGE" //

		super.addStockParts( desc );

		addPart( cars.racers.Remo:0x0000FFB4r, "steering wheel" );
		addPart( parts.pedals:0x0000BB01r, "stock pedals manual" );

		addPart( cars.racers.Remo:0x000000DBr, "stock_exhaust_pipe" );
		addPart( parts.mufflers:0x0000001Br, "muffler type 08" );

		if (desc.power > 1.25)
		{
			NOSInjectorSystem N2Oinjector=addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000052r, "NOS injector" );
			N2Oinjector.nitro_consumption = clampTo(N2Oinjector.maxconsumption*((desc.power-1.25)/0.75*0.550+0.150),N2Oinjector.minconsumption,N2Oinjector.maxconsumption);
			
			addPart( parts:0x000001C1r, "12pds canister" );
			if (desc.power > 1.8) addPart( parts:0x000001BFr, "24pds canister" );
		}
	}
}