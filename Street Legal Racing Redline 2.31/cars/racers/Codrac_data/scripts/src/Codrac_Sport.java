package java.game.cars;

import java.game.*;
import java.util.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;

public class Codrac_Sport extends Codrac_models
{
	public Codrac_Sport( int id )
	{
		super( id );
		carCategory = PACKAGE;

		makerName = "Einvagen Motor Company";
		vendorName = "Codrac";
		model = MODEL_SPORT;
		modelName = "Sport";
		vehicleName = "Einvagen " + vendorName + " " + modelName;
		name = getName();

		description = "Not so far Einvagen engineers have developed an another line of a compact city cars, Codrac series are believed to become a good cars for many european drivers. Besides, they have a great demand here in Valo City, especially this Codrac Sport model which is only 1334kg of weight and charged by the 1.8L 127HP engine. Such car must have a really good potential.";

		banned = 1;
		game_version = 2.31;

		value = mHUF2USD(2.067);
		brand_new_prestige_value = 24.75;
 
		fully_stripped_drag = 0.55;

		exhaustSlotIDList = new Vector();
		exhaustSlotIDList.addElement(new Integer(21));

		L_stock_door_slot = 4; //stock driver's door
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

		stock_parts_list_E  = new int[3];
		stock_parts_list_E[0] = parts.engines.Einvagen_Duhen_Ishima_Focer:0x000000D2r; // "1.8L I4" //
		stock_parts_list_E[1] = parts:0x000053FFr; // "stock battery" //
		stock_parts_list_E[2] = cars.racers.Codrac:0x00000125r; // "R trunk" //

		stock_parts_list_FL = new int[1];
		stock_parts_list_FL[0] = cars.racers.Codrac:0x00000116r; // "L headlights" //

		stock_parts_list_FR = new int[1];
		stock_parts_list_FR[0] = cars.racers.Codrac:0x0000011Cr; // "R headlights" //

		stock_parts_list_RL = new int[3];
		stock_parts_list_RL[0] = cars.racers.Codrac:0x0000011Ar; // "L taillights" //
		stock_parts_list_RL[1] = cars.racers.Codrac:0x00000121r; // "RL blinker" //
		stock_parts_list_RL[2] = cars.racers.Codrac:0x00000122r; // "RL window" //

		stock_parts_list_RR = new int[3];
		stock_parts_list_RR[0] = cars.racers.Codrac:0x0000011Fr; // "R taillights" //
		stock_parts_list_RR[1] = cars.racers.Codrac:0x00000123r; // "RR blinker" //
		stock_parts_list_RR[2] = cars.racers.Codrac:0x00000124r; // "RR window" //

		stock_parts_list_F  = new int[3];
		stock_parts_list_F[0] = cars.racers.Codrac:0x0000010Fr; // "F bumper" //
		stock_parts_list_F[1] = cars.racers.Codrac:0x0000010Cr; // "hood" //
		stock_parts_list_F[2] = cars.racers.Codrac:0x00000138r; // "F windshield" //

		stock_parts_list_Rr = new int[3];
		stock_parts_list_Rr[0] = cars.racers.Codrac:0x0000011Br; // "R bumper" //
		stock_parts_list_Rr[1] = cars.racers.Codrac:0x0000011Dr; // "R seats" //
		stock_parts_list_Rr[2] = cars.racers.Codrac:0x00000120r; // "R windshield" //

		stock_parts_list_L  = new int[5];
		stock_parts_list_L[0] = cars.racers.Codrac:0x00000110r; // "FL door" //
		stock_parts_list_L[1] = cars.racers.Codrac:0x00000111r; // "FL seat" //
		stock_parts_list_L[2] = cars.racers.Codrac:0x00000112r; // "FL window" //
		stock_parts_list_L[3] = cars.racers.Codrac:0x00000117r; // "L mirror" //
		stock_parts_list_L[4] = cars.racers.Codrac:0x00000119r; // "L sideskirt" //

		stock_parts_list_R  = new int[5];
		stock_parts_list_R[0] = cars.racers.Codrac:0x00000113r; // "FR door" //
		stock_parts_list_R[1] = cars.racers.Codrac:0x00000114r; // "FR seat" //
		stock_parts_list_R[2] = cars.racers.Codrac:0x00000115r; // "FR window" //
		stock_parts_list_R[3] = cars.racers.Codrac:0x00000118r; // "R mirror" //
		stock_parts_list_R[4] = cars.racers.Codrac:0x0000011Er; // "R sideskirt" //

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
		stock_parts_list_RGear_springs[0] = stock_parts_list_RGear_springs[1] = parts:0x00000122r; // "spring_Einvagen_GTK_front" //
		stock_parts_list_RGear_springs[2] = stock_parts_list_RGear_springs[3] = parts:0x00000121r; // "spring_Einvagen_GTK_rear" //

		stock_parts_list_RGear_brakes = new int[4];
		stock_parts_list_RGear_brakes[0] = stock_parts_list_RGear_brakes[1] = parts:0x00000151r; // "brake_Einvagen_GT_front" //
		stock_parts_list_RGear_brakes[2] = stock_parts_list_RGear_brakes[3] = parts:0x00000150r; // "brake_Einvagen_GT_rear" //

		stock_parts_list_RGear_sways = new int[2];
		stock_parts_list_RGear_sways[0] = parts:0x00000185r; // "swaybar_Einvagen_GT_front" //
		stock_parts_list_RGear_sways[1] = parts:0x00000186r; // "swaybar_Einvagen_GT_rear" //

		stock_parts_list_RGear_wheels = new int[4];
		stock_parts_list_RGear_wheels[0] = stock_parts_list_RGear_wheels[1] = parts.wheels:0x000002BAr; //rim_MT_Mescaline_10_0_15_ET__40_LOD_CATALOG_GARAGE
		stock_parts_list_RGear_wheels[2] = stock_parts_list_RGear_wheels[3] = parts.wheels:0x000002BAr; //rim_MT_Mescaline_10_0_15_ET__40_LOD_CATALOG_GARAGE

		stock_parts_list_RGear_tyres = new int[4];
		stock_parts_list_RGear_tyres[0] = stock_parts_list_RGear_tyres[1] = parts.wheels:0x0000042Dr; //tyre_215_50_15_8_0_LOD_CATALOG_GARAGE
		stock_parts_list_RGear_tyres[2] = stock_parts_list_RGear_tyres[3] = parts.wheels:0x0000042Dr; //tyre_215_50_15_8_0_LOD_CATALOG_GARAGE
		
		super.addStockParts( desc );

		addPart( cars.racers.Codrac:0x0000FFB4r, "steering wheel" );
		addPart( parts.pedals:0x0000BB01r, "stock pedals manual" );
		addPart( cars.racers.Codrac:0x00000139r, "stock_exhaust_pipe" );
		addPart( parts.mufflers:0x0000001Br, "muffler type 08" );
		addPart( parts.mufflers:0x0000001Br, "muffler type 08" );

		if (desc.power > 1.25)
		{
			NOSInjectorSystem N2Oinjector=addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000052r, "NOS injector" );
			N2Oinjector.nitro_consumption = clampTo(N2Oinjector.maxconsumption*((desc.power-1.25)/0.75*0.550+0.150),N2Oinjector.minconsumption,N2Oinjector.maxconsumption);
			
			addPart( parts:0x000001C1r, "12pds canister" );
			if (desc.power > 1.8) addPart( parts:0x000001C1r, "12pds canister" ); //second small canister
			if (desc.power > 1.5) addPart( parts:0x000001BFr, "24pds canister" );
		}
	}
}