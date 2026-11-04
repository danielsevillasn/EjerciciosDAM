while True:
    try:
        expresionMatematica = input("Dame una expresion mátematica simple: ")
        print(eval(expresionMatematica))
        break
    except SyntaxError:
        print("Expresion mal escrita")
    except TypeError:
        print("Operacion inválida, han de ser dos numeros")
    except ZeroDivisionError:
        print("La division no ha de ser entre 0")
    except NameError:
        print("El sistema a detectado una variable en vez de una operacion")
    except KeyboardInterrupt:
        print("Saliendo...")
        break
