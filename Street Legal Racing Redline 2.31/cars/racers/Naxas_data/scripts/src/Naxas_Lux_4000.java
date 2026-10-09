package java.game.cars;

import java.game.*;
import java.util.*;
import java.game.parts.*;
import java.game.parts.enginepart.airfueldeliverysystem.*;

public class Naxas_Lux_4000 extends Naxas_models
{
	public Naxas_Lux_4000( int id )
	{
		super( id );
		carCategory = PACKAGE;

		makerName = "Prime Finest American Automobiles";
		vendorName = "Naxas";
		model = MODEL_LUX_4000;
		modelName = "Lux 4000";
		vehicleName = "PFAA " + vendorName + " " + modelName;
		name = getName();

		description = "Being expensive and prestigeous, the Naxas line was extended by the Lux 4000 model in 2004. This car is an alive exception: it's almost 4500kg of weight but the brand-name 7.0L Prime 700HP engine handles it well. In addition, the classic Prime suspension was enhanced by the new wide 15-inch drag wheels that keep perfect handling even on extremely high speeds. This shocking car has gained 4 awards on a Valo City supercar show and many racers loved it.";

		banned = 1;
		game_version = 2.31;

		value = mHUF2USD(10.550);
		brand_new_prestige_value = 42.22;
 
		fully_stripped_drag = 0.55;

		exhaustSlotIDList = new Vector();
		exhaustSlotIDList.addElement(new Integer(18));
		exhaustSlotIDList.addElement(new Integer(23));

		L_stock_door_slot = 10; //stock driver's door
		R_stock_door_slot = 16; //stock passenger's door
	}

	public void addStockParts( Descriptor desc )
	{
		stock_parts_list_E  = new int[2];
		stock_parts_list_E[0] = parts.engines.MC_Prime_SuperDuty:0x0000003Fr; // "7.0L V8" //
		stock_parts_list_E[1] = parts:0x000000E8r; // "blue 55ah battery" //

		stock_parts_list_FL = new int[2];
		stock_parts_list_FL[0] = cars.racers.Naxas:0x000000CFr; // "F bumper 2" //
		stock_parts_list_FL[1] = cars.racers.Naxas:0x000000F8r; // "FL blinker" //

		stock_parts_list_FR = new int[1];
		stock_parts_list_FR[0] = cars.racers.Naxas:0x000000F9r; // "FR blinker" //

		stock_parts_list_RL = new int[2];
		stock_parts_list_RL[0] = cars.racers.Naxas:0x000000F1r; // "R bumper 2" //
		stock_parts_list_RL[1] = cars.racers.Naxas:0x000000EAr; // "RL blinker" //

		stock_parts_list_RR = new int[1];
		stock_parts_list_RR[0] = cars.racers.Naxas:0x000000ECr; // "RR blinker" //

		stock_parts_list_F  = new int[4];
		stock_parts_list_F[0] = cars.racers.Naxas:0x000000DDr; // "L headlights" //
		stock_parts_list_F[1] = cars.racers.Naxas:0x000000E4r; // "R headlights" //
		stock_parts_list_F[2] = cars.racers.Naxas:0x000000DBr; // "hood 2" //
		stock_parts_list_F[3] = cars.racers.Naxas:0x000000D1r; // "F windshield" //

		stock_parts_list_Rr = new int[4];
		stock_parts_list_Rr[1] = cars.racers.Naxas:0x000000EFr; // "trunk" //
		stock_parts_list_Rr[2] = cars.racers.Naxas:0x000000F0r; // "R windshield" //
		stock_parts_list_Rr[3] = cars.racers.Naxas:0x000000EEr; // "taillights" //

		stock_parts_list_L  = new int[6];
		stock_parts_list_L[0] = cars.racers.Naxas:0x000000E2r; // "L sideskirt 2" //
		stock_parts_list_L[1] = cars.racers.Naxas:0x000000D2r; // "FL door" //
		stock_parts_list_L[3] = cars.racers.Naxas:0x000000DFr; // "L mirror 2" //
		stock_parts_list_L[2] = cars.racers.Naxas:0x000000D5r; // "FL window" //
		stock_parts_list_L[4] = cars.racers.Naxas:0x000000D3r; // "FL seat" //
		stock_parts_list_L[5] = cars.racers.Naxas:0x000000F6r; // "L_RAM_intake" //

		stock_parts_list_R  = new int[6];
		stock_parts_list_R[0] = cars.racers.Naxas:0x000000F5r; // "R sideskirt 2" //
		stock_parts_list_R[1] = cars.racers.Naxas:0x000000D6r; // "FR door" //
		stock_parts_list_R[2] = cars.racers.Naxas:0x000000E6r; // "R mirror 2" //
		stock_parts_list_R[3] = cars.racers.Naxas:0x000000D9r; // "FR window" //
		stock_parts_list_R[4] = cars.racers.Naxas:0x000000D7r; // "FR seat" //
		stock_parts_list_R[5] = cars.racers.Naxas:0x000000FAr; // "R_RAM_intake" //

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
		stock_parts_list_RGear_wheels[0] = stock_parts_list_RGear_wheels[1] = parts.wheels:0x000022BCr; // rim MT_Mescaline 12.5 15 ET -85 LOD CATALOG GARAGE
		stock_parts_list_RGear_wheels[2] = stock_parts_list_RGear_wheels[3] = parts.wheels:0x000022BCr; // rim MT_Mescaline 11.0 15 ET -40 LOD CATALOG GARAGE

		stock_parts_list_RGear_tyres = new int[4];
		stock_parts_list_RGear_tyres[0] = stock_parts_list_RGear_tyres[1] = parts.wheels:0x0000242Br; // tyre 255 50 15 9.5 LOD CATALOG GARAGE
		stock_parts_list_RGear_tyres[2] = stock_parts_list_RGear_tyres[3] = parts.wheels:0x0000242Br; // tyre 255 50 15 9.5 LOD CATALOG GARAGE
		
		super.addStockParts( desc );

		addPart( cars.racers.Naxas:0x0000FFB4r, "steering wheel" );
		addPart( parts.pedals:0x0000BB01r, "stock pedals manual" );

		addPart( cars.racers.Naxas:0x000000F7r, "V8_stock_exhaust_pipe" );

		if (desc.power > 1.4)
		{
			NOSInjectorSystem N2Oinjector=addPart( parts.engines.Callaway_Cadillac_Bugatti_V16:0x00004DF5r, "NOS injector" );
			N2Oinjector.nitro_consumption = clampTo(N2Oinjector.maxconsumption*((desc.power-1.4)/0.6*0.500+0.500),N2Oinjector.minconsumption,N2Oinjector.maxconsumption);
			
			addPart( parts:0x000001C1r, "12pds canister" );
			if (desc.power > 1.8) addPart( parts:0x000001BFr, "24pds canister" );
		}
	}
}
