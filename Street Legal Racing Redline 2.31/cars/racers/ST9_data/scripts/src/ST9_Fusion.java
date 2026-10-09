package java.game.cars;

//RAXAT: build 928, turbo exhaust pipe added
import java.game.*;
import java.util.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;

public class ST9_Fusion extends ST9_models
{
	public ST9_Fusion( int id )
	{
		super( id );
		carCategory = PACKAGE;

		makerName = "Shimutshibu Motor Company";
		vendorName = "ST9";
		model = MODEL_FUSION;
		modelName = "Fusion";
		vehicleName = "Shimutshibu " + vendorName + " " + modelName;
		policeName = "Shimutshibu " + vendorName + " police car";
		name = getName();

		description = "The loved ST9 Challenge was carefully enhanced by Shimutshibu engineers in 2003 and has been released under the name ST9 Fusion. There are the turbocharged engine and a lightweight bodykit in the changes list.";

		banned = 1;
		game_version = 2.31;

		value = mHUF2USD(3.460);
		brand_new_prestige_value = 34.10;
 
		fully_stripped_drag = 0.55;

		exhaustSlotIDList = new Vector();
		exhaustSlotIDList.addElement(new Integer(998));

		L_stock_door_slot = 8; //stock driver's door
		R_stock_door_slot = 22; //stock passenger's door

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
		stock_parts_list_FL[0] = cars.racers.ST9:0x000000CFr; // "L headlights" //

		stock_parts_list_FR = new int[2];
		stock_parts_list_FR[0] = cars.racers.ST9:0x000000DDr; // "R headlights" //

		stock_parts_list_RL = new int[2];
		stock_parts_list_RL[0] = cars.racers.ST9:0x000000CCr; // "L taillights" //

		stock_parts_list_RR = new int[2];
		stock_parts_list_RR[0] = cars.racers.ST9:0x000000DEr; // "R taillights" //

		stock_parts_list_F  = new int[4];
		stock_parts_list_F[0] = cars.racers.ST9:0x000000DBr; // "F bumper 2" //
		stock_parts_list_F[1] = cars.racers.ST9:0x000000DCr; // "hood 2" //
		stock_parts_list_F[2] = cars.racers.ST9:0x000000C6r; // "F windshield" //
		stock_parts_list_F[3] = cars.racers.ST9:0x000000D3r; // "sunroof" //

		stock_parts_list_Rr = new int[5];
		stock_parts_list_Rr[0] = cars.racers.ST9:0x000000DAr; // "R bumper 2" //
		stock_parts_list_Rr[1] = cars.racers.ST9:0x000000CDr; // "trunk" //
		stock_parts_list_Rr[2] = parts.wings:0x00000028r; // "R wing" //
		stock_parts_list_Rr[3] = cars.racers.ST9:0x000000CAr; // "R windshield" //
		stock_parts_list_Rr[4] = cars.racers.ST9:0x000000C5r; // "R seats" //

		stock_parts_list_L  = new int[5];
		stock_parts_list_L[0] = cars.racers.ST9:0x000000D5r; // "L sideskirt 2" //
		stock_parts_list_L[1] = cars.racers.ST9:0x000000CBr; // "FL door" //
		stock_parts_list_L[2] = cars.racers.ST9:0x000000D1r; // "FL window" //
		stock_parts_list_L[3] = cars.racers.ST9:0x000000D8r; // "L mirror 2" //
		stock_parts_list_L[4] = cars.racers.ST9:0x000000ECr; // "FL seat" //

		stock_parts_list_R  = new int[5];
		stock_parts_list_R[0] = cars.racers.ST9:0x000000DFr; // "R sideskirt 2" //
		stock_parts_list_R[1] = cars.racers.ST9:0x000000D6r; // "FR door" //
		stock_parts_list_R[2] = cars.racers.ST9:0x000000D2r; // "FR window" //
		stock_parts_list_R[3] = cars.racers.ST9:0x000000D9r; // "R mirror 2" //
		stock_parts_list_R[4] = cars.racers.ST9:0x000000EDr; // "FR seat" //

		// running gear parts lists //

		// stock 1 stuffs //

		stock_parts_list_RGear_suspensions = new int[4];
		stock_parts_list_RGear_suspensions[0] = parts:0x0000020Dr; // "Focer_200_FL_McPherson_strut" //
		stock_parts_list_RGear_suspensions[1] = parts:0x0000020Er; // "Focer_200_FR_McPherson_strut" //
		stock_parts_list_RGear_suspensions[2] = parts:0x0000020Fr; // "Focer_200_RL_trailing_arm" //
		stock_parts_list_RGear_suspensions[3] = parts:0x00000210r; // "Focer_200_RR_trailing_arm" //

		stock_parts_list_RGear_shocks = new int[4];
		stock_parts_list_RGear_shocks[0] = stock_parts_list_RGear_shocks[1] = parts:0x000001BEr; // "shock_absorber_Focer_200_front" //
		stock_parts_list_RGear_shocks[2] = stock_parts_list_RGear_shocks[3] = parts:0x000001C0r; // "shock_absorber_Focer_200_rear" //

		stock_parts_list_RGear_springs = new int[4];
		stock_parts_list_RGear_springs[0] = stock_parts_list_RGear_springs[1] = parts:0x000001E6r; // "spring_Focer_200_front" //
		stock_parts_list_RGear_springs[2] = stock_parts_list_RGear_springs[3] = parts:0x000001E7r; // "spring_Focer_200_rear" //

		stock_parts_list_RGear_brakes = new int[4];
		stock_parts_list_RGear_brakes[0] = stock_parts_list_RGear_brakes[1] = parts:0x00000176r; // "brake_Focer_200_front" //
		stock_parts_list_RGear_brakes[2] = stock_parts_list_RGear_brakes[3] = parts:0x00000177r; // "brake_Focer_200_rear" //

		stock_parts_list_RGear_sways = new int[2];
		stock_parts_list_RGear_sways[0] = parts:0x000001A2r; // "swaybar_Focer_200_front" //
		stock_parts_list_RGear_sways[1] = parts:0x000001A3r; // "swaybar_Focer_200_rear" //

		stock_parts_list_RGear_wheels = new int[4];
		stock_parts_list_RGear_wheels[0] = stock_parts_list_RGear_wheels[1] = parts.wheels:0x000002EEr; // rim_SL_Tuners_DS1_8_0_17_ET_0_LOD_CATALOG_GARAGE
		stock_parts_list_RGear_wheels[2] = stock_parts_list_RGear_wheels[3] = parts.wheels:0x000002EEr; // rim_SL_Tuners_DS1_8_0_17_ET_0_LOD_CATALOG_GARAGE

		stock_parts_list_RGear_tyres = new int[4];
		stock_parts_list_RGear_tyres[0] = stock_parts_list_RGear_tyres[1] = parts.wheels:0x000003DDr; // tyre_225_45_17_9_0_LOD_CATALOG_GARAGE
		stock_parts_list_RGear_tyres[2] = stock_parts_list_RGear_tyres[3] = parts.wheels:0x000003DDr; // tyre_225_45_17_9_0_LOD_CATALOG_GARAGE

		super.addStockParts( desc );
		
		addPart( cars.racers.ST9:0x0000FFB4r, "steering wheel" );
		addPart( parts.pedals:0x0000BB02r, "stock pedals auto" );

		addPart( cars.racers.ST9:0x000000EFr, "turbo_exhaust_pipe" );
		addPart( parts.mufflers:0x0000001Br, "muffler type 08" );

		if (desc.power > 1.25) addPart( parts.interior:0x00000024r, "rear wing", cars:0x0000003Br, 1.0, 1.0 );

		float amount_injected = 0.5;
		if(desc.power > 1.5) amount_injected = 0.7;
		
		if (desc.power > 1.1 && desc.power < 1.3)
		{
			NOSInjectorSystem N2Oinjector=addPart( parts.engines.Einvagen_Duhen_Ishima_Focer:0x00000052r, "NOS injector" );
			N2Oinjector.nitro_consumption = clampTo(N2Oinjector.maxconsumption*((desc.power-1.1)/0.2*amount_injected+0.500),N2Oinjector.minconsumption,N2Oinjector.maxconsumption);
			
			addPart( parts:0x000001BFr, "24pds canister" );
			if (desc.power > 1.2)
			{
				addPart( parts:0x000001C1r, "12pds canister" );
				addPart( parts:0x000001C1r, "12pds canister" );
			}
		}
	}
}
