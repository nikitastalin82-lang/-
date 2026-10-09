package java.game.cars;

import java.game.*;
import java.util.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;

public class Sunset_E98T extends Sunset_models
{
	public Sunset_E98T( int id )
	{
		super( id );
		carCategory = PACKAGE;

		makerName = "Shimutshibu Motor Company";
		vendorName = "Sunset";
		model = MODEL_E98T;
		modelName = "E98T";
		vehicleName = "Shimutshibu " + vendorName + " " + modelName;
		name = getName();

		description = "An improved Sunset E98T was released in 1998 for japaneese youth that loves high speed driving, and they got all they need for this: the 2.0L engine taken from the E96S gained a turbocharger to produce a 252HP of power. The improved suspension made this car safe enough for the agressive high speed driving. The same low price made Sunset E98T very popular amongst japanese young drivers.";

		banned = 1;
		game_version = 2.31;

		value = mHUF2USD(1.709);
		brand_new_prestige_value = 29.23;
 
		fully_stripped_drag = 0.55;

		exhaustSlotIDList = new Vector();
		exhaustSlotIDList.addElement(new Integer(29));

		L_stock_door_slot = 10; //stock driver's door
		R_stock_door_slot = 11; //stock passenger's door

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
		stock_parts_list_E[0] = parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000F9r; // "Shimutshibu RC B95S200 2.0L I4" //
		stock_parts_list_E[1] = parts:0x000000E8r; // "blue 55ah battery" //
		
		stock_parts_list_FL = new int[1];
		stock_parts_list_FL[0] = cars.racers.Sunset:0x000000F9r; // "L headlights" //

		stock_parts_list_FR = new int[1];
		stock_parts_list_FR[0] = cars.racers.Sunset:0x0000010Br; // "R headlights" //

		stock_parts_list_RL = new int[3];
		stock_parts_list_RL[0] = cars.racers.Sunset:0x000000F8r; // "trunk" //
		stock_parts_list_RL[1] = cars.racers.Sunset:0x00000106r; // "L taillights" //
		stock_parts_list_RL[2] = cars.racers.Sunset:0x00000105r; // "RL blinker" //

		stock_parts_list_RR = new int[2];
		stock_parts_list_RR[0] = cars.racers.Sunset:0x00000111r; // "R taillights" //
		stock_parts_list_RR[1] = cars.racers.Sunset:0x00000110r; // "RR blinker" //

		stock_parts_list_F  = new int[3];
		stock_parts_list_F[0] = cars.racers.Sunset:0x000000F4r; // "F bumper 2" //
		stock_parts_list_F[1] = cars.racers.Sunset:0x00000120r; // "hood 2" //
		stock_parts_list_F[2] = cars.racers.Sunset:0x00000100r; // "F windshield" //

		stock_parts_list_Rr = new int[6];
		stock_parts_list_Rr[0] = cars.racers.Sunset:0x000000F6r; // "R bumper 2" //
		stock_parts_list_Rr[1] = cars.racers.Sunset:0x000000FFr; // "R windshield" //
		stock_parts_list_Rr[2] = cars.racers.Sunset:0x000000F2r; // "R seats" //
		stock_parts_list_Rr[3] = cars.racers.Sunset:0x00000111r; // "R taillights" //
		stock_parts_list_Rr[4] = cars.racers.Sunset:0x00000106r; // "L taillights" //
		stock_parts_list_Rr[5] = cars.racers.Sunset:0x000000F3r; // "R wing" //

		stock_parts_list_L  = new int[6];
		stock_parts_list_L[0] = cars.racers.Sunset:0x00000108r; // "L sideskirt 2" //
		stock_parts_list_L[1] = cars.racers.Sunset:0x000000F7r; // "FL door" //
		stock_parts_list_L[2] = cars.racers.Sunset:0x000000FDr; // "FL window" //
		stock_parts_list_L[3] = cars.racers.Sunset:0x00000112r; // "L mirror 2" //
		stock_parts_list_L[4] = cars.racers.Sunset:0x000000FEr; // "RL window" //
		stock_parts_list_L[5] = cars.racers.Sunset:0x00000107r; // "FL seat" //

		stock_parts_list_R  = new int[6];
		stock_parts_list_R[0] = cars.racers.Sunset:0x0000010Dr; // "R sideskirt 2" //
		stock_parts_list_R[1] = cars.racers.Sunset:0x0000010Fr; // "FR door" //
		stock_parts_list_R[2] = cars.racers.Sunset:0x00000102r; // "FR window" //
		stock_parts_list_R[3] = cars.racers.Sunset:0x00000113r; // "R mirror 2" //
		stock_parts_list_R[4] = cars.racers.Sunset:0x00000101r; // "RR window" //
		stock_parts_list_R[5] = cars.racers.Sunset:0x000000FAr; // "FR seat" //
		
		//stage 1 //

		stg_1_parts_list_FL = new int[1];
		stg_1_parts_list_FL[0] = cars.racers.Sunset:0x000000F9r; // "L headlights" //

		stg_1_parts_list_FR = new int[1];
		stg_1_parts_list_FR[0] = cars.racers.Sunset:0x0000010Br; // "R headlights" //

		stg_1_parts_list_RL = new int[3];
		stg_1_parts_list_RL[0] = cars.racers.Sunset:0x000000F8r; // "trunk" //
		stg_1_parts_list_RL[1] = cars.racers.Sunset:0x00000106r; // "L taillights" //
		stg_1_parts_list_RL[2] = cars.racers.Sunset:0x00000105r; // "RL blinker" //

		stg_1_parts_list_RR = new int[2];
		stg_1_parts_list_RR[0] = cars.racers.Sunset:0x00000111r; // "R taillights" //
		stg_1_parts_list_RR[1] = cars.racers.Sunset:0x00000110r; // "RR blinker" //

		stg_1_parts_list_F  = new int[3];
		stg_1_parts_list_F[0] = cars.racers.Sunset:0x000000FBr; // "F bumper 3" //
		stg_1_parts_list_F[1] = cars.racers.Sunset:0x0000011Fr; // "hood 3" //
		stg_1_parts_list_F[2] = cars.racers.Sunset:0x00000100r; // "F windshield" //

		stg_1_parts_list_Rr = new int[4];
		stg_1_parts_list_Rr[0] = cars.racers.Sunset:0x00000118r; // "R bumper 3" //
		stg_1_parts_list_Rr[1] = cars.racers.Sunset:0x000000FFr; // "R windshield" //
		stg_1_parts_list_Rr[2] = cars.racers.Sunset:0x000000F2r; // "R seats" //
		stg_1_parts_list_Rr[3] = cars.racers.Sunset:0x000000F3r; // "R wing" //

		stg_1_parts_list_L  = new int[6];
		stg_1_parts_list_L[0] = cars.racers.Sunset:0x00000109r; // "L sideskirt 3" //
		stg_1_parts_list_L[1] = cars.racers.Sunset:0x000000F7r; // "FL door" //
		stg_1_parts_list_L[2] = cars.racers.Sunset:0x000000FDr; // "FL window" //
		stg_1_parts_list_L[3] = cars.racers.Sunset:0x00000114r; // "L mirror 3" //
		stg_1_parts_list_L[4] = cars.racers.Sunset:0x000000FEr; // "RL window" //
		stg_1_parts_list_L[5] = cars.racers.Sunset:0x00000107r; // "FL seat" //

		stg_1_parts_list_R  = new int[6];
		stg_1_parts_list_R[0] = cars.racers.Sunset:0x0000010Er; // "R sideskirt 3" //
		stg_1_parts_list_R[1] = cars.racers.Sunset:0x0000010Fr; // "FR door" //
		stg_1_parts_list_R[2] = cars.racers.Sunset:0x00000102r; // "FR window" //
		stg_1_parts_list_R[3] = cars.racers.Sunset:0x00000117r; // "R mirror 3" //
		stg_1_parts_list_R[4] = cars.racers.Sunset:0x00000101r; // "RR window" //
		stg_1_parts_list_R[5] = cars.racers.Sunset:0x000000FAr; // "FR seat" //

		// running gear parts lists //

		if (desc.power < 1.3)
		{
			stock_parts_list_RGear_suspensions = new int[4];
			stock_parts_list_RGear_suspensions[0] = parts:0x00000211r; // "Focer_300_FL_McPherson_strut" //
			stock_parts_list_RGear_suspensions[1] = parts:0x00000212r; // "Focer_300_FR_McPherson_strut" //
			stock_parts_list_RGear_suspensions[2] = parts:0x00000213r; // "Focer_300_RL_trailing_arm" //
			stock_parts_list_RGear_suspensions[3] = parts:0x00000214r; // "Focer_300_RR_trailing_arm" //

			stock_parts_list_RGear_shocks = new int[4];
			stock_parts_list_RGear_shocks[0] = stock_parts_list_RGear_shocks[1] = parts:0x000001C6r; // "shock_absorber_Focer_300_front" //
			stock_parts_list_RGear_shocks[2] = stock_parts_list_RGear_shocks[3] = parts:0x000001D3r; // "shock_absorber_Focer_300_rear" //

			stock_parts_list_RGear_springs = new int[4];
			stock_parts_list_RGear_springs[0] = stock_parts_list_RGear_springs[1] = parts:0x000001E8r; // "spring_Focer_300_front" //
			stock_parts_list_RGear_springs[2] = stock_parts_list_RGear_springs[3] = parts:0x000001E9r; // "spring_Focer_300_rear" //

			stock_parts_list_RGear_brakes = new int[4];
			stock_parts_list_RGear_brakes[0] = stock_parts_list_RGear_brakes[1] = parts:0x00000178r; // "brake_Focer_300_front" //
			stock_parts_list_RGear_brakes[2] = stock_parts_list_RGear_brakes[3] = parts:0x00000179r; // "brake_Focer_300_rear" //

			stock_parts_list_RGear_sways = new int[2];
			stock_parts_list_RGear_sways[0] = parts:0x000001A4r; // "swaybar_Focer_300_front" //
			stock_parts_list_RGear_sways[1] = parts:0x000001A6r; // "swaybar_Focer_300_rear" //

			stock_parts_list_RGear_wheels = new int[4];
			stock_parts_list_RGear_wheels[0] = stock_parts_list_RGear_wheels[1] = parts.wheels:0x00000378r; // "rim Star_II 9.0 17 ET -30 LOD CATALOG GARAGE" //
			stock_parts_list_RGear_wheels[2] = stock_parts_list_RGear_wheels[3] = parts.wheels:0x00000378r; // "rim Star_II 9.0 17 ET -30 LOD CATALOG GARAGE" //

			stock_parts_list_RGear_tyres = new int[4];
			stock_parts_list_RGear_tyres[0] = stock_parts_list_RGear_tyres[1] = parts.wheels:0x000003DDr; // "tyre 225 45 17 9.0 LOD CATALOG GARAGE" //
			stock_parts_list_RGear_tyres[2] = stock_parts_list_RGear_tyres[3] = parts.wheels:0x000003DDr; // "tyre 225 45 17 9.0 LOD CATALOG GARAGE" //
		}
		else
		{
			stock_parts_list_RGear_suspensions = new int[4];
			stock_parts_list_RGear_suspensions[0] = parts:0x00000215r; // "Focer_WRC_FL_McPherson_strut" //
			stock_parts_list_RGear_suspensions[1] = parts:0x00000216r; // "Focer_WRC_FR_McPherson_strut" //
			stock_parts_list_RGear_suspensions[2] = parts:0x00000217r; // "Focer_WRC_RL_trailing_arm" //
			stock_parts_list_RGear_suspensions[3] = parts:0x00000218r; // "Focer_WRC_RR_trailing_arm" //

			stock_parts_list_RGear_shocks = new int[4];
			stock_parts_list_RGear_shocks[0] = stock_parts_list_RGear_shocks[1] = parts:0x000001D4r; // "shock_absorber_Focer_WRC_front" //
			stock_parts_list_RGear_shocks[2] = stock_parts_list_RGear_shocks[3] = parts:0x000001D5r; // "shock_absorber_Focer_WRC_rear" //

			stock_parts_list_RGear_springs = new int[4];
			stock_parts_list_RGear_springs[0] = stock_parts_list_RGear_springs[1] = parts:0x000001EAr; // "spring_Focer_WRC_front" //
			stock_parts_list_RGear_springs[2] = stock_parts_list_RGear_springs[3] = parts:0x000001EBr; // "spring_Focer_WRC_rear" //

			stock_parts_list_RGear_brakes = new int[4];
			stock_parts_list_RGear_brakes[0] = stock_parts_list_RGear_brakes[1] = parts:0x0000017Ar; // "brake_Focer_WRC_front" //
			stock_parts_list_RGear_brakes[2] = stock_parts_list_RGear_brakes[3] = parts:0x0000017Br; // "brake_Focer_WRC_rear" //

			stock_parts_list_RGear_sways = new int[2];
			stock_parts_list_RGear_sways[0] = parts:0x000001A7r; // "swaybar_Focer_WRC_front" //
			stock_parts_list_RGear_sways[1] = parts:0x000001A9r; // "swaybar_Focer_WRC_rear" //

			stock_parts_list_RGear_wheels = new int[4];
			stock_parts_list_RGear_wheels[0] = stock_parts_list_RGear_wheels[1] = parts.wheels:0x00000400r; // rim Baiern_DTM 11.0 19 ET -25 LOD CATALOG GARAGE
			stock_parts_list_RGear_wheels[2] = stock_parts_list_RGear_wheels[3] = parts.wheels:0x00000400r; // rim Baiern_DTM 11.0 19 ET -25 LOD CATALOG GARAGE

			stock_parts_list_RGear_tyres = new int[4];
			stock_parts_list_RGear_tyres[0] = stock_parts_list_RGear_tyres[1] = parts.wheels:0x00000404r; // tyre 255 25 19 11.0 LOD CATALOG GARAGE
			stock_parts_list_RGear_tyres[2] = stock_parts_list_RGear_tyres[3] = parts.wheels:0x00000404r; // tyre 255 25 19 11.0 LOD CATALOG GARAGE
		}

		super.addStockParts( desc );
		
		addPart( cars.racers.Sunset:0x0000FFB4r, "steering wheel" );
		addPart( parts.pedals:0x0000BB02r, "stock pedals auto" );

		addPart( cars.racers.Sunset:0x0000E11Er, "turbo_exhaust_pipe" );
		addPart( parts.mufflers:0x0000001Br, "muffler type 08" );

		float amount_injected = 0.5;
		if(desc.power > 1.5) amount_injected = 0.75;
		
		if (desc.power > 1.1 && desc.power < 1.3)
		{
			NOSInjectorSystem N2Oinjector=addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000052r, "NOS injector" );
			N2Oinjector.nitro_consumption = clampTo(N2Oinjector.maxconsumption*((desc.power-1.1)/0.2*amount_injected+0.500),N2Oinjector.minconsumption,N2Oinjector.maxconsumption);
			
			addPart( parts:0x000001C1r, "12pds canister" );
			if (desc.power > 1.2)
			{
				addPart( parts:0x000001BFr, "24pds canister" );
				addPart( parts:0x000001BFr, "24pds canister" );
			}
		}
	}
}