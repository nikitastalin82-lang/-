package java.game.cars;

import java.game.*;
import java.util.*;
import java.util.resource.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;


public class Ninja_PowerLine_S extends Ninja_models
{
	public Ninja_PowerLine_S( int id )
	{
		super( id );
		carCategory = PACKAGE;

		makerName = "Duhen Motor Company";
		vendorName = "Ninja";
		model = MODEL_POWERLINE_S;
		modelName = "PowerLine S";
		vehicleName = "Duhen " + vendorName + " " + modelName;
		name = getName();

		description = "After the unlucky TurboHatch Duhen Inc. extended Ninja series with a PowerLine models. The first model was a Ninja PowerLine S, it has gained a naturally aspirated 2.2L engine and a sport-looking bodykit.";

		banned = 1;
		game_version = 2.31;

		value = mHUF2USD(2.025);
		brand_new_prestige_value = 24.36;
 
		fully_stripped_drag = 0.55;

		exhaustSlotIDList = new Vector();
		exhaustSlotIDList.addElement(new Integer(38));

		L_stock_door_slot = 4; //stock driver's door
		R_stock_door_slot = 6; //stock passenger's door

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
		stock_parts_list_E[0] = parts.engines.Einvagen_Duhen_Ishima_Focer:0x0000000Ar; // "Duhen D22V I-4" //
		stock_parts_list_E[1] = parts:0x000000E8r; // "blue 55ah battery" //

		stock_parts_list_FL = new int[1];
		stock_parts_list_FL[0] = cars.racers.Ninja:0x000000E3r; // "L headlights" //

		stock_parts_list_FR = new int[1];
		stock_parts_list_FR[0] = cars.racers.Ninja:0x000000E8r; // "R headlights" //

		stock_parts_list_RL = new int[1];
		stock_parts_list_RL[0] = cars.racers.Ninja:0x000000F5r; // "L taillights" //

		stock_parts_list_RR = new int[1];
		stock_parts_list_RR[0] = cars.racers.Ninja:0x000000E6r; // "R taillights" //

		stock_parts_list_F  = new int[3];
		stock_parts_list_F[0] = cars.racers.Ninja:0x000000FCr; // "F bumper 2" //
		stock_parts_list_F[1] = cars.racers.Ninja:0x000000E7r; // "hood" //
		stock_parts_list_F[2] = cars.racers.Ninja:0x000000F6r; // "F windshield" //

		stock_parts_list_Rr = new int[5];
		stock_parts_list_Rr[0] = cars.racers.Ninja:0x000000FDr; // "R bumper 2" //
		stock_parts_list_Rr[1] = cars.racers.Ninja:0x000000E4r; // "R door" //
		stock_parts_list_Rr[2] = cars.racers.Ninja:0x000000F7r; // "R windshield" //
		stock_parts_list_Rr[3] = cars.racers.Ninja:0x000000E9r; // "R seats" //
		stock_parts_list_Rr[4] = cars.racers.Ninja:0x000000FFr; // "R wing" //

		stock_parts_list_L  = new int[6];
		stock_parts_list_L[0] = cars.racers.Ninja:0x000000FBr; // "L sideskirt 2" //
		stock_parts_list_L[1] = cars.racers.Ninja:0x000000EDr; // "FL door" //
		stock_parts_list_L[2] = cars.racers.Ninja:0x000000F8r; // "FL window" //
		stock_parts_list_L[3] = cars.racers.Ninja:0x000000FEr; // "L mirror 2" //
		stock_parts_list_L[4] = cars.racers.Ninja:0x000000F3r; // "FL seat" //
		stock_parts_list_L[5] = cars.racers.Ninja:0x000000EBr; // "RL window" //

		stock_parts_list_R  = new int[6];
		stock_parts_list_R[0] = cars.racers.Ninja:0x00000109r; // "R sideskirt 2" //
		stock_parts_list_R[1] = cars.racers.Ninja:0x000000ECr; // "FR door" //
		stock_parts_list_R[2] = cars.racers.Ninja:0x000000F9r; // "FR window" //
		stock_parts_list_R[3] = cars.racers.Ninja:0x00000106r; // "R mirror 2" //
		stock_parts_list_R[4] = cars.racers.Ninja:0x000000EAr; // "FR seat" //
		stock_parts_list_R[5] = cars.racers.Ninja:0x000000E5r; // "RR window" //

		super.addStockParts( desc );

		// running gear parts lists //

		stock_parts_list_RGear_suspensions = new int[4];
		stock_parts_list_RGear_suspensions[0] = parts:0x00003124r; // "SunStrip_18_FL_McPherson_strut" //
		stock_parts_list_RGear_suspensions[1] = parts:0x00003163r; // "SunStrip_18_FR_McPherson_strut" //
		stock_parts_list_RGear_suspensions[2] = parts:0x00003164r; // "SunStrip_18_RL_trailing_arm" //
		stock_parts_list_RGear_suspensions[3] = parts:0x00003165r; // "SunStrip_18_RR_trailing_arm" //

		stock_parts_list_RGear_shocks = new int[4];
		stock_parts_list_RGear_shocks[0] = stock_parts_list_RGear_shocks[1] = parts:0x00000062r; // "shock_absorber_SunStrip_18_front" //
		stock_parts_list_RGear_shocks[2] = stock_parts_list_RGear_shocks[3] = parts:0x00000063r; // "shock_absorber_SunStrip_18_rear" //

		stock_parts_list_RGear_springs = new int[4];
		stock_parts_list_RGear_springs[0] = stock_parts_list_RGear_springs[1] = parts:0x00000009r; // "spring_SunStrip_18_front" //
		stock_parts_list_RGear_springs[2] = stock_parts_list_RGear_springs[3] = parts:0x0000000Er; // "spring_SunStrip_18_rear" //

		stock_parts_list_RGear_brakes = new int[4];
		stock_parts_list_RGear_brakes[0] = stock_parts_list_RGear_brakes[1] = parts:0x00000169r; // "brake_SunStrip_18_front" //
		stock_parts_list_RGear_brakes[2] = stock_parts_list_RGear_brakes[3] = parts:0x0000016Ar; // "brake_SunStrip_18_rear" //

		stock_parts_list_RGear_sways = new int[2];
		stock_parts_list_RGear_sways[0] = parts:0x0000017Dr; // "swaybar_SunStrip_18_front" //
		stock_parts_list_RGear_sways[1] = parts:0x0000017Er; // "swaybar_SunStrip_18_rear" //

		stock_parts_list_RGear_wheels = new int[4];
		stock_parts_list_RGear_wheels[0] = stock_parts_list_RGear_wheels[1] = parts.wheels:0x000003A2r; // "rim Blossom 8.0 17 ET 0 LOD CATALOG GARAGE" //
		stock_parts_list_RGear_wheels[2] = stock_parts_list_RGear_wheels[3] = parts.wheels:0x000003A2r; // "rim Blossom 8.0 17 ET 0 LOD CATALOG GARAGE" //

		stock_parts_list_RGear_tyres = new int[4];
		stock_parts_list_RGear_tyres[0] = stock_parts_list_RGear_tyres[1] = parts.wheels:0x000003D3r; // "tyre 205 55 17 8.0 LOD CATALOG GARAGE" //
		stock_parts_list_RGear_tyres[2] = stock_parts_list_RGear_tyres[3] = parts.wheels:0x000003D3r; // "tyre 205 55 17 8.0 LOD CATALOG GARAGE" //

		super.addStockParts( desc );

		addPart( cars.racers.Ninja:0x0000FFB4r, "steering wheel" );
		addPart( parts.pedals:0x0000BB02r, "stock pedals auto" );

		if (desc.power > 1.7)
		{
			NOSInjectorSystem N2Oinjector=addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000052r, "NOS injector" );
			N2Oinjector.nitro_consumption = clampTo(N2Oinjector.maxconsumption*((desc.power-1.7)/0.3*0.750+0.250),N2Oinjector.minconsumption,N2Oinjector.maxconsumption);
			
			addPart( parts:0x000001C1r, "12pds canister" );
			addPart( parts:0x000001BFr, "24pds canister" );
		}

		addPart( cars.racers.Ninja:0x0000010Fr, "stock_exhaust_pipe" );
		addPart( parts.mufflers:0x0000001Br, "muffler type 08" );
	}
}
