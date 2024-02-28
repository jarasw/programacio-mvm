# Observatori by Joel Jara

from datetime import datetime, timedelta

# Emmagatzema les temperatures setmanals
temperatures_setmanals = []

def bienvenida():
    print("Benvingut al registre de temperatures de l'Observatori Jara")
    print("----------------------------------------------------------")

def mostrar_menu():
    print("[RT] Registrar temperatures setmanals.")
    print("[MJ] Consultar temperatura mitjana.")
    print("[DF] Consultar diferència màxima.")
    print("[FI] Sortir.")

def programa_principal():
    bienvenida()
    
    while True:
        mostrar_menu()
        opcion = input("Opció: ").upper()

        if opcion == "RT":
            registrar_temperatures()
        elif opcion == "MJ":
            consultar_temperatura_mitjana()
        elif opcion == "DF":
            consultar_diferencia_maxima()
        elif opcion == "FI":
            print("Fins la pròxima!")
            break
        else:
            print("Opció no vàlida. Si us plau, tria una altre opció.")

def registrar_temperatures():
    global temperatures_setmanals
    temperatures_input = input("Escriu les temperatures d'aquesta setmana (separades per espais): ")
    temperatures_setmanals = [float(temp.replace(',', '.')) for temp in temperatures_input.split()]
    print("Temperatures enregistrades amb èxit.")
    calcular_data_actual()

def calcular_data_actual():
    # Assumeix que es comença a registrar a l'inici de l'any (1 de gener)
    global temperatures_setmanals
    setmanes_transcorregudes = len(temperatures_setmanals) // 7
    data_inicial = datetime(2024, 1, 1)
    data_actual = data_inicial + timedelta(days=setmanes_transcorregudes * 7)  # Cambio a días en lugar de semanas
    print(f"Fins avui {data_actual.strftime('%d de %B')}")

def consultar_temperatura_mitjana():
    global temperatures_setmanals
    if not temperatures_setmanals:
        print("No hi ha temperatures registrades.")
    else:
        calcular_data_actual()
        mitjana = sum(temperatures_setmanals) / len(temperatures_setmanals)
        print(f"I la temperatura mitjana ha estat de {mitjana:.6f} graus.")

def consultar_diferencia_maxima():
    global temperatures_setmanals
    if not temperatures_setmanals:
        print("No hi ha temperatures registrades.")
    else:
        calcular_data_actual()
        maxima = max(temperatures_setmanals)
        minima = min(temperatures_setmanals)
        diferencia_maxima = maxima - minima
        print(f"I la diferència màxima ha estat de {diferencia_maxima:.6f} graus.")

# Inicia el programa
programa_principal()
