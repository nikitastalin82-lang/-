package java.game.cars;

import java.game.*;
import java.util.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;

public class Whisper_C555 extends Whisper_models
{
	public Whisper_C555( int id )
	{
		super( id );
		carCategory = PACKAGE;

		makerName = "Prime Finest American Automobiles";
		vendorName = "Whisper";
		model = MODEL_C555;
		modelName = "C555";
		vehicleName = "PFAA " + vendorName + " " + modelName;
		name = getName();

		description = "An old project of PFAA became reality in 1998 when they've presented their Whisper concept car. The Whisper project has found its investors very fast and the first car got released in 1999 under the name Whisper C555. This car had an agressive look and it was fast enough. The good handling was also a big plus for its potential buyers and the Whisper C555 has got a widespread popularity closer to the beginning of the year 2001.";

		banned = 1;
		game_version = 2.31;

		value = mHUF2USD(5.865);
		brand_new_prestige_value = 43.32;
 
		fully_stripped_drag = 0.55;

		exhaustSlotIDList = new Vector();
		exhaustSlotIDList.addElement(new Integer(25));
		exhaustSlotIDList.addElement(new Integer(26));

		L_stock_door_slot = 6; //stock driver's door
		R_stock_door_slot = 22; //stock passenger's door
	}

	public void addStockParts( Descriptor desc )
	{
		// stock 1 stuffs //

		stock_parts_list_FL = new int[1];
		stock_parts_list_FL[0] = cars.racers.Whisper:0x000000EEr; // "L headlights" //

		stock_parts_list_FR = new int[1];
		stock_parts_list_FR[0] = cars.racers.Whisper:0x000000F8r; // "R headlights" //

		stock_parts_list_RL = new int[1];
		stock_parts_list_RL[0] = cars.racers.Whisper:0x000000F4r; // "L taillights" //

		stock_parts_list_RR = new int[1];
		stock_parts_list_RR[0] = cars.racers.Whisper:0x00000102r; // "R taillights" //

		stock_parts_list_F  = new int[3];
		stock_parts_list_F[0] = cars.racers.Whisper:0x000000E2r; // "F bumper" //
		stock_parts_list_F[1] = cars.racers.Whisper:0x000000EBr; // "hood" //
		stock_parts_list_F[2] = cars.racers.Whisper:0x000000E5r; // "F windshield" //

		stock_parts_list_Rr = new int[3];
		stock_parts_list_Rr[0] = cars.racers.Whisper:0x000000F5r; // "R bumper" //
		stock_parts_list_Rr[1] = cars.racers.Whisper:0x000000FDr; // "trunk" //
		stock_parts_list_Rr[2] = cars.racers.Whisper:0x000000FCr; // "R windshield" //

		stock_parts_list_L  = new int[5];
		stock_parts_list_L[0] = cars.racers.Whisper:0x000000F1r; // "L sideskirt" //
		stock_parts_list_L[1] = cars.racers.Whisper:0x000000E6r; // "FL door" //
		stock_parts_list_L[2] = cars.racers.Whisper:0x000000EFr; // "L mirror" //
		stock_parts_list_L[3] = cars.racers.Whisper:0x000000E8r; // "FL window" //
		stock_parts_list_L[4] = cars.racers.Whisper:0x000000E7r; // "FL seat" //

		stock_parts_list_R  = new int[5];
		stock_parts_list_R[0] = cars.racers.Whisper:0x000000F9r; // "R sideskirt" //
		stock_parts_list_R[1] = cars.racers.Whisper:0x000000E9r; // "FR door" //
		stock_parts_list_R[2] = cars.racers.Whisper:0x00000109r; // "R mirror" //
		stock_parts_list_R[3] = cars.racers.Whisper:0x000000EAr; // "FR window" //
		stock_parts_list_R[4] = cars.racers.Whisper:0x00000103r; // "FR seat" //

		stock_parts_list_E  = new int[2];
		stock_parts_list_E[0] = parts.engines.Callaway_Cadillac_Bugatti_V16:0x00000001r; // "5.5L V16" //
		stock_parts_list_E[1] = parts:0x000000E8r; // "blue 55ah battery" //

		// running gear parts lists //

		// stock 1 stuffs //

		stock_parts_list_RGear_suspensions = new int[4];
		stock_parts_list_RGear_suspensions[0] = parts:0x00000209r; // "Prime_FL_McPherson_strut" //
		stock_parts_list_RGear_suspensions[1] = parts:0x0000020Ar; // "Prime_FR_McPherson_strut" //
		stock_parts_list_RGear_suspensions[2] = parts:0x0000020Br; // "Prime_RL_trailing_arm" //
		stock_parts_list_RGear_suspensions[3] = parts:0x0000020Cr; // "Prime_RR_trailing_arm" //

		stock_parts_list_RGear_shocks = new int[4];
		stock_parts_list_RGear_shocks[0] = stock_parts_list_RGear_shocks[1] = parts:0x000001BBr; // "shock_absorber_Prime_front" //
		stock_parts_list_RGear_shocks[2] = stock_parts_list_RGear_shocks[3] = parts:0x000001BDr; // "shock_absorber_Prime_rear" //

		stock_parts_list_RGear_springs = new int[4];
		stock_parts_list_RGear_springs[0] = stock_parts_list_RGear_springs[1] = parts:0x000001E4r; // "spring_Prime_front" //
		stock_parts_list_RGear_springs[2] = stock_parts_list_RGear_springs[3] = parts:0x000001E5r; // "spring_Prime_rear" //

		stock_parts_list_RGear_brakes = new int[4];
		stock_parts_list_RGear_brakes[0] = stock_parts_list_RGear_brakes[1] = parts:0x00000174r; // "brake_Prime_front" //
		stock_parts_list_RGear_brakes[2] = stock_parts_list_RGear_brakes[3] = parts:0x00000175r; // "brake_Prime_rear" //

		stock_parts_list_RGear_sways = new int[2];
		stock_parts_list_RGear_sways[0] = parts:0x000001A0r; // "swaybar_Prime_front" //
		stock_parts_list_RGear_sways[1] = parts:0x000001A1r; // "swaybar_Prime_rear" //

		stock_parts_list_RGear_wheels = new int[4];
		stock_parts_list_RGear_wheels[0] = stock_parts_list_RGear_wheels[1] = parts.wheels:0x000002C2r; // "rim Prime_DLH 9.0 17 ET -30 LOD CATALOG GARAGE" //
		stock_parts_list_RGear_wheels[2] = stock_parts_list_RGear_wheels[3] = parts.wheels:0x000002C2r; // "rim Prime_DLH 10.0 17 ET -30 LOD CATALOG GARAGE" //

		stock_parts_list_RGear_tyres = new int[4];
		stock_parts_list_RGear_tyres[0] = stock_parts_list_RGear_tyres[1] = parts.wheels:0x000003E3r; // "tyre 235 45 17 9.0 LOD CATALOG GARAGE" //
		stock_parts_list_RGear_tyres[2] = stock_parts_list_RGear_tyres[3] = parts.wheels:0x000003E3r; // "tyre 265 45 17 11.0 LOD CATALOG GARAGE"//

		super.addStockParts( desc );

		addPart( cars.racers.Whisper:0x0000FFB4r, "steering wheel" );
		addPart( parts.pedals:0x0000BB01r, "stock pedals manual" );

		addPart( cars.racers.Whisper:0x0000E13Ar, "L_v16_stock_exhaust_pipe" );
		addPart( cars.racers.Whisper:0x0000E13Br, "R_V16_stock_exhaust_pipe" );
		addPart( parts.mufflers:0x0000001Fr, "muffler type 12" );
		addPart( parts.mufflers:0x0000001Fr, "muffler type 12" );

		if (desc.power > 1.4)
		{
			NOSInjectorSystem N2Oinjector=addPart( parts.engines.Callaway_Cadillac_Bugatti_V16:0x00004DF5r, "NOS injector" );
			N2Oinjector.nitro_consumption = clampTo(N2Oinjector.maxconsumption*((desc.power-1.4)/0.6*0.500+0.500),N2Oinjector.minconsumption,N2Oinjector.maxconsumption);
			
			addPart( parts:0x000001C1r, "12pds canister" );
			addPart( parts:0x000001BFr, "24pds canister" );

			//additional canisters
			if (desc.power > 1.8)
			{
				addPart( parts:0x000001C1r, "12pds canister" );
				addPart( parts:0x000001BFr, "24pds canister" );
			}
		}
	}
}
