package java.game.cars;

import java.game.*;
import java.util.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;


public class Ninja_Tourer extends Ninja_models
{
	public Ninja_Tourer( int id )
	{
		super( id );
		carCategory = PACKAGE;

		makerName = "Duhen Motor Company";
		vendorName = "Ninja";
		model = MODEL_TOURER;
		modelName = "Tourer";
		vehicleName = "Duhen " + vendorName + " " + modelName;
		policeName = "Duhen " + vendorName + " police car";
		name = getName();

		description = "The Ninja Tourer represents the first racing experience of Duhen Inc., lightened and additionally balanced chassis now stands on a racing suspension with 19-inch wheels supplied with the soft slicks. And the new 2.0L 367HP engine is believed to accelerate this body well.";

		banned = 1;
		game_version = 2.31;

		value = mHUF2USD(4.768);
		brand_new_prestige_value = 30.96;
 
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
		stock_parts_list_E[1] = parts:0x000000E9r; // "silver 65ah battery" //

		stock_parts_list_FL = new int[1];
		stock_parts_list_FL[0] = cars.racers.Ninja:0x000000E3r; // "L headlights" //

		stock_parts_list_FR = new int[1];
		stock_parts_list_FR[0] = cars.racers.Ninja:0x000000E8r; // "R headlights" //

		stock_parts_list_RL = new int[1];
		stock_parts_list_RL[0] = cars.racers.Ninja:0x000000F5r; // "L taillights" //

		stock_parts_list_RR = new int[1];
		stock_parts_list_RR[0] = cars.racers.Ninja:0x000000E6r; // "R taillights" //

		stock_parts_list_F  = new int[3];
		stock_parts_list_F[0] = cars.racers.Ninja:0x000000FAr; // "F bumper 3" //
		stock_parts_list_F[1] = cars.racers.Ninja:0x00000102r; // "hood 3" //
		stock_parts_list_F[2] = cars.racers.Ninja:0x000000F6r; // "F windshield" //

		stock_parts_list_Rr = new int[5];
		stock_parts_list_Rr[0] = cars.racers.Ninja:0x00000101r; // "R bumper 3" //
		stock_parts_list_Rr[1] = cars.racers.Ninja:0x000000E4r; // "R door" //
		stock_parts_list_Rr[2] = cars.racers.Ninja:0x000000F7r; // "R windshield" //
		stock_parts_list_Rr[3] = cars.racers.Ninja:0x000000FFr; // "R wing 2" //
		stock_parts_list_Rr[4] = cars.racers.Ninja:0x00000103r; // "Rf wing 2" //

		stock_parts_list_L  = new int[6];
		stock_parts_list_L[0] = cars.racers.Ninja:0x00000104r; // "L sideskirt 3" //
		stock_parts_list_L[1] = cars.racers.Ninja:0x000000EDr; // "FL door" //
		stock_parts_list_L[2] = cars.racers.Ninja:0x000000F8r; // "FL window" //
		stock_parts_list_L[3] = cars.racers.Ninja:0x00000105r; // "L mirror 3" //
		stock_parts_list_L[4] = parts.interior:0x00000049r; // "FL seat" //
		stock_parts_list_L[5] = cars.racers.Ninja:0x000000EBr; // "RL window" //

		stock_parts_list_R  = new int[6];
		stock_parts_list_R[0] = cars.racers.Ninja:0x00000108r; // "R sideskirt 3" //
		stock_parts_list_R[1] = cars.racers.Ninja:0x000000ECr; // "FR door" //
		stock_parts_list_R[2] = cars.racers.Ninja:0x000000F9r; // "FR window" //
		stock_parts_list_R[3] = cars.racers.Ninja:0x00000107r; // "R mirror 3" //
		stock_parts_list_R[4] = parts.interior:0x00000049r; // "FR seat" //
		stock_parts_list_R[5] = cars.racers.Ninja:0x000000E5r; // "RR window" //

		// running gear parts lists //

		stock_parts_list_RGear_suspensions = new int[4];
		stock_parts_list_RGear_suspensions[0] = parts:0x0000316Ar; // "SunStrip_20_FL_McPherson_strut" //
		stock_parts_list_RGear_suspensions[1] = parts:0x0000316Br; // "SunStrip_20_FR_McPherson_strut" //
		stock_parts_list_RGear_suspensions[2] = parts:0x0000316Cr; // "SunStrip_20_RL_trailing_arm" //
		stock_parts_list_RGear_suspensions[3] = parts:0x0000316Dr; // "SunStrip_20_RR_trailing_arm" //

		stock_parts_list_RGear_shocks = new int[4];
		stock_parts_list_RGear_shocks[0] = stock_parts_list_RGear_shocks[1] = parts:0x0000006Br; // "shock_absorber_SunStrip_20_front" //
		stock_parts_list_RGear_shocks[2] = stock_parts_list_RGear_shocks[3] = parts:0x0000006Cr; // "shock_absorber_SunStrip_20_rear" //

		stock_parts_list_RGear_springs = new int[4];
		stock_parts_list_RGear_springs[0] = stock_parts_list_RGear_springs[1] = parts:0x00000015r; // "spring_SunStrip_20_front" //
		stock_parts_list_RGear_springs[2] = stock_parts_list_RGear_springs[3] = parts:0x0000005Dr; // "spring_SunStrip_20_rear" //

		stock_parts_list_RGear_brakes = new int[4];
		stock_parts_list_RGear_brakes[0] = stock_parts_list_RGear_brakes[1] = parts:0x0000016Dr; // "brake_SunStrip_20_front" //
		stock_parts_list_RGear_brakes[2] = stock_parts_list_RGear_brakes[3] = parts:0x0000016Er; // "brake_SunStrip_20_rear" //

		stock_parts_list_RGear_sways = new int[2];
		stock_parts_list_RGear_sways[0] = parts:0x00000182r; // "swaybar_SunStrip_20_front" //
		stock_parts_list_RGear_sways[1] = parts:0x00000184r; // "swaybar_SunStrip_20_rear" //

		stock_parts_list_RGear_wheels = new int[4];
		stock_parts_list_RGear_wheels[0] = stock_parts_list_RGear_wheels[1] = parts.wheels:0x000003A0r; // "rim Blossom 10.5 19 ET 0 LOD CATALOG GARAGE" //
		stock_parts_list_RGear_wheels[2] = stock_parts_list_RGear_wheels[3] = parts.wheels:0x000003A0r; // "rim Blossom 10.5 19 ET 0 LOD CATALOG GARAGE" //

		stock_parts_list_RGear_tyres = new int[4];
		stock_parts_list_RGear_tyres[0] = stock_parts_list_RGear_tyres[1] = parts.wheels:0x00000404r; // "tyre 255 25 19 11.0 LOD CATALOG GARAGE" //
		stock_parts_list_RGear_tyres[2] = stock_parts_list_RGear_tyres[3] = parts.wheels:0x00000404r; // "tyre 255 25 19 11.0 LOD CATALOG GARAGE" //

		super.addStockParts( desc );

		addPart( parts.interior:0x00000024r, "steering wheel" );
		addPart( parts.pedals:0x0000BB02r, "stock pedals auto" );

		if (desc.power > 1.7)
		{
			NOSInjectorSystem N2Oinjector=addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000052r, "NOS injector" );
			N2Oinjector.nitro_consumption = clampTo(N2Oinjector.maxconsumption*((desc.power-1.7)/0.3*0.750+0.250),N2Oinjector.minconsumption,N2Oinjector.maxconsumption);
			
			addPart( parts:0x000001C1r, "12pds canister" );
			addPart( parts:0x000001BFr, "24pds canister" );
		}

		addPart( cars.racers.Ninja:0x0000010Er, "turbo_exhaust_pipe" );
		addPart( parts.mufflers:0x0000001Br, "muffler type 08" );
	}
}
