package java.game.cars;

import java.game.*;
import java.util.*;
import java.util.resource.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;


public class Coyot_C1500 extends Coyot_models
{
	public Coyot_C1500( int id )
	{
		super( id );
		carCategory = PACKAGE;

		makerName = "Duhen Incorporated";
		vendorName = "Coyot";
		model = MODEL_C1500;
		modelName = "C1500";
		vehicleName = "Duhen " + vendorName + " " + modelName;
		name = getName();

		description = "Duhen Inc. decided to organize a competetion for Einvagen on european car market by releasing the Coyot Series. This C1500 basic model is what's the typical european driver needs: a 1678kg total mass, brand-name Duhen city suspension and a 1.5L 142HP engine, optimal solution for a cheap city car.";

		banned = 1;
		game_version = 2.31;

		value = mHUF2USD(1.097);
		brand_new_prestige_value = 27.85;
 
		fully_stripped_drag = 0.55;

		exhaustSlotIDList = new Vector();
		exhaustSlotIDList.addElement(new Integer(39));

//		L_stock_door_slot = 5; //stock driver's door
//		R_stock_door_slot = 8; //stock passenger's door

//		L_scissor_door_slot = 650; //scissor driver's door
//		R_scissor_door_slot = 651; //scissor passenger's door

//		L_suicide_door_slot = 653; //suicide driver's door
//		R_suicide_door_slot = 652; //suicide passenger's door

//		L_butterfly_door_slot = 654; //butterfly driver's door
//		R_butterfly_door_slot = 655; //butterfly passenger's door

//		L_custom_door_slot = 658; //custom driver's door
//		R_custom_door_slot = 657; //custom passenger's door
	}

	public void addStockParts( Descriptor desc )
	{
		stock_parts_list_E  = new int[2];
		stock_parts_list_E[0] = parts.engines.Einvagen_Duhen_Ishima_Focer:0x0000008Fr; // "Duhen D15V I-4" //
		stock_parts_list_E[1] = parts:0x000053FFr; // "stock battery" //


		stock_parts_list_F  = new int[4];
		stock_parts_list_F[0] = cars.racers.Coyot:0x000000FFr; // "F bumper" //
		stock_parts_list_F[1] = cars.racers.Coyot:0x000000E8r; // "hood" //
		stock_parts_list_F[2] = cars.racers.Coyot:0x000000E1r; // "F windshield" //
		stock_parts_list_F[3] = cars.racers.Coyot:0x000000E0r; // "F grill" //

		stock_parts_list_Rr = new int[8];
		stock_parts_list_Rr[0] = cars.racers.Coyot:0x000000FBr; // "R bumper" //
		stock_parts_list_Rr[1] = cars.racers.Coyot:0x00000103r; // "trunk" //
		stock_parts_list_Rr[2] = cars.racers.Coyot:0x000000F3r; // "R windshield" //
		stock_parts_list_Rr[3] = cars.racers.Coyot:0x000000F6r; // "R seats" //
		stock_parts_list_Rr[4] = cars.racers.Coyot:0x000000F7r; // "RL door" //
		stock_parts_list_Rr[5] = cars.racers.Coyot:0x000000F1r; // "RR door" //
		stock_parts_list_Rr[6] = cars.racers.Coyot:0x000000F0r; // "RL window" //
		stock_parts_list_Rr[7] = cars.racers.Coyot:0x000000DFr; // "RR window" //

		stock_parts_list_L  = new int[8];
		stock_parts_list_L[0] = cars.racers.Coyot:0x000000EFr; // "L sideskirt" //
		stock_parts_list_L[1] = cars.racers.Coyot:0x000000E2r; // "FL door" //
		stock_parts_list_L[2] = cars.racers.Coyot:0x000000E4r; // "FL window" //
		stock_parts_list_L[3] = cars.racers.Coyot:0x000000ECr; // "L mirror" //
		stock_parts_list_L[4] = cars.racers.Coyot:0x000000E3r; // "FL seat" //
		stock_parts_list_L[5] = cars.racers.Coyot:0x000000EBr; // "L headlights" //
		stock_parts_list_L[6] = cars.racers.Coyot:0x00000102r; // "L taillights" //
		stock_parts_list_L[7] = cars.racers.Coyot:0x000000FEr; // "RL brake_light" //

		stock_parts_list_R  = new int[8];
		stock_parts_list_R[0] = cars.racers.Coyot:0x0000010Fr; // "R sideskirt" //
		stock_parts_list_R[1] = cars.racers.Coyot:0x000000E5r; // "FR door" //
		stock_parts_list_R[2] = cars.racers.Coyot:0x000000E7r; // "FR window" //
		stock_parts_list_R[3] = cars.racers.Coyot:0x000000F4r; // "R mirror" //
		stock_parts_list_R[4] = cars.racers.Coyot:0x000000E6r; // "FR seat" //
		stock_parts_list_R[5] = cars.racers.Coyot:0x00000104r; // "R headlights" //
		stock_parts_list_R[6] = cars.racers.Coyot:0x00000105r; // "R taillights" //
		stock_parts_list_R[7] = cars.racers.Coyot:0x00000106r; // "RR brake_light" //

		// running gear parts lists //

		stock_parts_list_RGear_suspensions = new int[4];
		stock_parts_list_RGear_suspensions[0] = parts:0x000030FCr; // "SS_15_FL_McPherson" //
		stock_parts_list_RGear_suspensions[1] = parts:0x00003147r; // "SS_15_FR_McPherson" //
		stock_parts_list_RGear_suspensions[2] = parts:0x0000314Ar; // "SS_15_RL_Trailing-arm" //
		stock_parts_list_RGear_suspensions[3] = parts:0x0000315Dr; // "SS_15_RR_Trailing-arm" //

		stock_parts_list_RGear_shocks = new int[4];
		stock_parts_list_RGear_shocks[0] = stock_parts_list_RGear_shocks[1] = parts:0x0000005Fr; // "SS_15_6100_N/m/s" //
		stock_parts_list_RGear_shocks[2] = stock_parts_list_RGear_shocks[3] = parts:0x00000061r; // "SS_15_5700_N/m/s" //

		stock_parts_list_RGear_springs = new int[4];
		stock_parts_list_RGear_springs[0] = stock_parts_list_RGear_springs[1] = parts:0x00000002r; // "SS_15_7.2_kgfpm_9in" //
		stock_parts_list_RGear_springs[2] = stock_parts_list_RGear_springs[3] = parts:0x00000005r; // "SS_15_7.2_kgfpm_9.5in" //

		stock_parts_list_RGear_brakes = new int[4];
		stock_parts_list_RGear_brakes[0] = stock_parts_list_RGear_brakes[1] = parts:0x00000167r; // "SS_15_265mm_2caliper" //
		stock_parts_list_RGear_brakes[2] = stock_parts_list_RGear_brakes[3] = parts:0x00000168r; // "SS_15_235mm_2caliper" //

		stock_parts_list_RGear_sways = new int[2];
		stock_parts_list_RGear_sways[0] = parts:0x000041FFr; // "swaybar_SunStrip_15_front" //
		stock_parts_list_RGear_sways[1] = parts:0x0000017Cr; // "swaybar_SunStrip_15_rear" //

		stock_parts_list_RGear_wheels = new int[4];
		stock_parts_list_RGear_wheels[0] = stock_parts_list_RGear_wheels[1] = parts.wheels:0x000003A2r; // "Star_II_9.5x17_ET-30" //
		stock_parts_list_RGear_wheels[2] = stock_parts_list_RGear_wheels[3] = parts.wheels:0x000003A2r; // "Star_II_9.5x17_ET-30" //

		stock_parts_list_RGear_tyres = new int[4];
		stock_parts_list_RGear_tyres[0] = stock_parts_list_RGear_tyres[1] = parts.wheels:0x000003D3r; // "245_45_17_sport" //
		stock_parts_list_RGear_tyres[2] = stock_parts_list_RGear_tyres[3] = parts.wheels:0x000003D3r; // "245_45_17_sport" //

		super.addStockParts( desc );

		addPart( cars.racers.Coyot:0x0000FFB4r, "steering wheel" );
		addPart( parts.pedals:0x0000BB01r, "stock pedals manual" );

		if (desc.power > 1.8)
		{
			NOSInjectorSystem N2Oinjector=addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000052r, "NOS injector" );
			N2Oinjector.nitro_consumption = clampTo(N2Oinjector.maxconsumption*((desc.power-1.8)/0.2*0.700+0.300),N2Oinjector.minconsumption,N2Oinjector.maxconsumption);
			
			addPart( parts:0x000001C1r, "12pds canister" );
			addPart( parts:0x000001BFr, "24pds canister" );
		}

		/*
		if (desc.power > 1.4)
		{
			addPart( cars.racers.Coyot:0x0000010Br, "turbo_exhaust_pipe" );
			addPart( parts.mufflers:0x0000001Br, "muffler type 08" );
		}
		else
		*/
		//{
			addPart( cars.racers.Coyot:0x0000010Cr, "stock_exhaust_pipe" );
			addPart( parts.mufflers:0x0000001Br, "muffler type 08" );
		//}
	}
}